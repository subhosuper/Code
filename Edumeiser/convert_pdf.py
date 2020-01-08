import PyPDF2

file_name = open("doc2.pdf","rb")
pdf_reader = PyPDF2.PdfFileReader(file_name)
pdf_pages = pdf_reader.numPages

extracted_pages=""
for page in range(pdf_pages):
    pdf_obj = pdf_reader.getPage(page)
    pdf_text = pdf_obj.extractText()
    extracted_pages =  extracted_pages+" "+pdf_text
# print(extracted_pages)
pdf_to_text_file = open("PDF-doc2.txt","a")
pdf_to_text_file.write(extracted_pages)
