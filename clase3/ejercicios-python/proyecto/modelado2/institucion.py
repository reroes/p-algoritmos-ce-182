"""
    @reroes
"""

class Universidad:
    """
        Definir la clase Universidad
    """

    def __init__(self):
        self.nombre = ""

    def __init__(self, nombre):
        self.nombre = nombre
    
    def presentar_datos(self):
        print(u"%s" % (self.nombre))

    def agregar_nombre(self, n):  
        self.nombre = n

    def obtener_nombre(self):
        return self.nombre

