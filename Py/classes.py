class Pessoa(object):
  def __init__(self, idade, nome):
    self.idade = idade
    self.nome = nome
  def ligar(self):
    print('Fazendo ligação...')
  def viver(self):
    print('Vivendo...')

class Aluno(Pessoa):
  def estudar(self):
    print('Estudando...')

class Professor(Pessoa):
  def ensinar(self):
    print('Ensinando...')