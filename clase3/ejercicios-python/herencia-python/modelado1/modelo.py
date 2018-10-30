"""
    @reroes
"""
class Persona(object):
    """
        Definir la clase Persona
    """

    def __init__(self):
        self.nombre = ""
        self.apellido = ""
        self.edad = 0

    def presentar_datos(self):
        return "%s-%s-%s" % (self.obtener_nombre(), self.apellido, self.edad)

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


class Estudiante(Persona):
    """
    """

    def __init__(self):
        # Llamada al constructor para establecer nombre y color  
        # super().__init__(nombre, color)       
        super(Estudiante, self).__init__()       
        self.matricula = 30.2

    def agregar_matricula(self, n):  
        self.matricula = n

    def obtener_matricula(self):
        return self.matricula


    def presentar_datos(self):
        return "%s-%s" % (super(Estudiante, self).presentar_datos(), self.matricula)

