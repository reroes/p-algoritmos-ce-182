"""
    @reroes
"""
class Persona:
    """
        Definir la clase Persona
    """

    def __init__(self):
        self.nombre = ""
        self.apellido = ""
        self.edad = 0

    def presentar_datos(self):
        print("%s-%s-%s" % (self.obtener_nombre(), self.apellido, self.edad))

    def agregar_nombre(self, n):  
        self.nombre = n

    def obtener_nombre(self):
        return self.nombre

    def agregar_apellido(self, n):  
        self.apellido = n

    def obtener_apellido(self):
        return self.apellido

    def agregar_edad(self, n):  
        self.edad = n

    def obtener_edad(self):
        return self.edad

