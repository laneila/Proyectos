import nomina
import os
import time

control = True

while control:
    os.system('cls')
    nomina.menu()
    
    try:
        opc = int(input("Seleccione el número correspondiente al tipo de empleado: "))
    except ValueError:
        print("\nError: Por favor, ingrese un número válido.")
        time.sleep(1)
        continue
    
    if opc == 1:
        os.system('cls')
        print("Por favor, ingrese los siguientes datos\n")
        nombre = input("Nombre del empleado: ")
        cargo = input("Cargo: ")
        try:
            horast = int(input("Horas trabajadas (mes): "))
            horaex = int(input("Horas extras: "))
        except ValueError:
            print("\nError: Por favor, ingrese valores numéricos válidos para horas.")
            time.sleep(1)
            continue
        
        dato_empleado = nomina.administrativo(nombre, cargo, horast, horaex)
        
        with open("nomina.txt", 'a') as archivo:
            archivo.write(dato_empleado)
            
        input("\n Presione <Enter> para volver al menú.")

    elif opc == 2:
        os.system('cls')
        print("Por favor, ingrese los siguientes datos\n")
        nombre = input("Nombre del empleado: ")
        cargo = input("Cargo: ")
        time.sleep(1)
        
        cargo = cargo.lower().title()
        
        if "Conductor" in cargo:
            os.system('cls')
            dato_empleado = nomina.Conductor(nombre, cargo)
        elif "Oficios Generales" in cargo:
            os.system('cls')
            dato_empleado = nomina.Oficios_Generales(nombre, cargo)
        elif "Vigilancia" in cargo:
            os.system('cls')
            dato_empleado = nomina.vigilancia(nombre, cargo)
        else:
            print("\nError: Cargo no reconocido.")
            time.sleep(1)
            continue
        
        with open("nomina.txt", 'a') as archivo:
            archivo.write(dato_empleado)
        
        input("\n Presione <Enter> para volver al menú.")

    elif opc == 3:
        print("\n¡Ha salido del programa!")
        time.sleep(1)
        break
    
    elif opc < 1 or opc > 3:
        print("\nError! Intente de nuevo.")
        time.sleep(1)
