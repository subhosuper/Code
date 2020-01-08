import re
def read_file(file_name):
    file = open(file_name, "r")
    file_data = file.readlines()
    print(file_data)
    mod_sentences = []
    for sentence in file_data:
        sentence = re.findall('\w+', sentence)
        sentence = ' '.join(sentence)
        mod_sentences.append(sentence)
    
    # print(mod_sentences)

read_file("test.txt")   