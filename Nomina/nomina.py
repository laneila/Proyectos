import os

def iniciar_archivo(archivo):
    if os.path.exists(archivo):
        with open(archivo, 'a+', encoding='utf-8') as archivo:
            archivo.seek(0)
            contenido = archivo.read()
            if not contenido:
                encabezado = "|{:<40}| {:<31}| {:<5}| {:<16}| {:<5}| {:<17}| {:<16}| {:<16}| {:<17}| {:<2}\n━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n".format(
                    "Nombre", "Cargo", "HT", "Salario", "HE", "TPHE", "Salud", "Pensión", "ARL", "Total a Pagar")
                archivo.write(encabezado)

def menu():
    iniciar_archivo('nomina.txt')
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("  ━  Transportes del Gran Caribe Colombiano S.C.A. - TransCaribeCol  ━  ")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n")
    print("El empleado es de tipo:\n")
    print("1. Administrativo.")
    print("2. Operativo.\n")
    print("3. Salir del programa.\n")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━\n")

def volante_de_pago_admi(nombre, cargo, horast, horaex, total_horaex, porc_salud, salud_form, porc_pension, pension_form, porc_ARL, ARL_form, salario_bruto, total_descuento, total_pagar):
    os.system('cls')
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━⋆ VOLANTE DE PAGO ⋆━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print()
    print("Nombre:", nombre)
    print("Cargo:", cargo)
    print("Horas trabajadas (mes):", horast)
    print("Salario bruto:", salario_bruto)
    print("Horas Extra: ", horaex)
    print("Total de Horas Extras: ", total_horaex)
    print()
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━⋆ DESCUENTOS DE LEY ⋆━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print()
    print(f"Salud ({porc_salud}%):", salud_form)
    print(f"Pensión ({porc_pension}%):", pension_form)
    print(f"ARL ({porc_ARL}%):", ARL_form)
    print("Total de Descuentos:", total_descuento)
    print("Total a pagar:", total_pagar)
    print()
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━⋆ FIN DEL VOLANTE DE PAGO ⋆━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")

def volante_de_pago(nombre, cargo, horast, porc_salud, salud_form, porc_pension, pension_form, porc_ARL, ARL_form, salario_bruto, total_descuento, total_pagar):
    os.system('cls')
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━⋆ VOLANTE DE PAGO ⋆━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print()
    print("Nombre:", nombre)
    print("Cargo:", cargo)
    print("Horas trabajadas (mes):", horast)
    print("Salario bruto:", salario_bruto)
    print()
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━⋆ DESCUENTOS DE LEY ⋆━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print()
    print(f"Salud ({porc_salud}%):", salud_form)
    print(f"Pensión ({porc_pension}%):", pension_form)
    print(f"ARL ({porc_ARL}%):", ARL_form)
    print("Total de Descuentos:", total_descuento)
    print("Total a pagar:", total_pagar)
    print()
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━⋆ FIN DEL VOLANTE DE PAGO ⋆━━━━━━━━━━━━━━━")
    print("━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━")

def administrativo(nombre, cargo, horast, horaex):
    cargo = cargo.lower().title()
    nombre = nombre.lower().title()
    
    salariob = horast * 20000
    salario_bruto = '${:,.0f}'.format(salariob)
    tlhoraex = horaex * 25000
    total_horaex = '${:,.0f}'.format(tlhoraex)
    total1 = salariob + tlhoraex
    
    porc_salud = 4
    porc_pension = 4
    porc_ARL = 0.522
    
    salud = total1 * 0.04
    salud_form = '${:,.0f}'.format(salud)
    
    pension = total1 * 0.04
    pension_form = '${:,.0f}'.format(pension)
    
    ARL = total1 * 0.00522
    ARL_form = '${:,.0f}'.format(ARL)
    
    totaldes = salud + pension + ARL
    total_descuento = '${:,.0f}'.format(totaldes)
    
    totalpag = total1 - totaldes
    total_pagar = '${:,.0f}'.format(totalpag)
    
    resultado = "|{:<40}| {:<31}| {:<5}| {:<16}| {:<5}| {:<17}| {:<16}| {:<16}| {:<17}| {:<2}\n".format(
        nombre, cargo, horast, salario_bruto, horaex, total_horaex, salud_form, pension_form, ARL_form, total_pagar)
    
    volante_de_pago_admi(nombre, cargo, horast, horaex, total_horaex, porc_salud, salud_form, porc_pension, pension_form, porc_ARL, ARL_form, salario_bruto, total_descuento, total_pagar)
    
    return resultado

def Conductor(nombre, cargo):
    nombre = nombre.lower().title()
    cargo = cargo.lower().title()
    salario_bruto = '$1.500.000'
    
    porc_salud = 4
    porc_pension = 4
    porc_ARL = 0.522
    
    salud_form = '$60.000'
    pension_form = '$60.000'
    ARL_form = '$7.830'
    
    total_descuento = '$127.830'
    total_pagar = '$1.372.170'
    
    resultado = "|{:<40}| {:<31}| {:<5}| {:<16}| {:<5}| {:<17}| {:<16}| {:<16}| {:<17}| {:<2}\n".format(
        nombre, cargo, 'N/A', salario_bruto, 'N/A', 'N/A', salud_form, pension_form, ARL_form, total_pagar)
    
    volante_de_pago(nombre, cargo, 'N/A', porc_salud, salud_form, porc_pension, pension_form, porc_ARL, ARL_form, salario_bruto, total_descuento, total_pagar)
    
    return resultado

def Oficios_Generales(nombre, cargo):
    nombre = nombre.lower().title()
    cargo = cargo.lower().title()
    salario_bruto = '$1.200.000'
    
    porc_salud = 4
    porc_pension = 4
    porc_ARL = 0.522
    
    salud_form = '$48.000'
    pension_form = '$48.000'
    ARL_form = '$6.264'
    
    total_descuento = '$102.264'
    total_pagar = '$1.097.736'
    
    resultado = "|{:<40}| {:<31}| {:<5}| {:<16}| {:<5}| {:<17}| {:<16}| {:<16}| {:<17}| {:<2}\n".format(
        nombre, cargo, 'N/A', salario_bruto, 'N/A', 'N/A', salud_form, pension_form, ARL_form, total_pagar)
    
    volante_de_pago(nombre, cargo, 'N/A', porc_salud, salud_form, porc_pension, pension_form, porc_ARL, ARL_form, salario_bruto, total_descuento, total_pagar)
    
    return resultado

def vigilancia(nombre, cargo):
    nombre = nombre.lower().title()
    cargo = cargo.lower().title()
    salario_bruto = '$1.100.000'
    
    porc_salud = 4
    porc_pension = 4
    porc_ARL = 0.522
    
    salud_form = '$44.000'
    pension_form = '$44.000'
    ARL_form = '$5.742'
    
    total_descuento = '$93.742'
    total_pagar = '$1.006.258'
    
    resultado = "|{:<40}| {:<31}| {:<5}| {:<16}| {:<5}| {:<17}| {:<16}| {:<16}| {:<17}| {:<2}\n".format(
        nombre, cargo, 'N/A', salario_bruto, 'N/A', 'N/A', salud_form, pension_form, ARL_form, total_pagar)
    
    volante_de_pago(nombre, cargo, 'N/A', porc_salud, salud_form, porc_pension, pension_form, porc_ARL, ARL_form, salario_bruto, total_descuento, total_pagar)
    
    return resultado

