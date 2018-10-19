numero_estudiantes = 100


class Persona:
	
	def __init__(self):
		self.nombre = ""
		self.apellido = ""
		self.edad = 0

	def presentar_datos(self):
		print("%s-%s-%s" % (self.nombre, self.apellido, self.edad))

	def modificar_nombre(self, n):
		self.nombre = n

	def obtener_nombre(self):
		return self.nombre

	def presentar_datos_2(self):
		print("%s-%s-%s" % (self.obtener_nombre(), self.apellido, self.edad))
