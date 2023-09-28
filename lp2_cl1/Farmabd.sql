create database Farmabd;
use Farmabd;
create table Medicamentos(
	idMedicamento int primary key auto_increment,
    nombre varchar(255),
    descripcion text,
    categoria varchar(50),
    precio decimal(10,2),
    stock int,
    fechaVencimiento date,
    proveedor varchar(100)
);
insert into Medicamentos 
(nombre, descripcion, categoria, precio, stock, fechaVencimiento, proveedor) 
values
('Paracetamol','Analgésico común','Analgésico','5','100','2024-12-31','Genérico Pharma'),
('Amoxicilina','Antibiótico','Antibiótico','10.5','50','2023-11-15','Farmacia A'),
('Vitamina C','Suplemento Vitamínico','Vitaminas','8.75','75','2024-08-01','Proveedor B'),
('Ibuprofeno','Antiinflamatorio','Analgésico','6.25','60','2023-10-20','Genérico Pharma'),
('Omeprazol','Medicamento GI','GI','12.3','40','2023-12-10','Farmacia A');