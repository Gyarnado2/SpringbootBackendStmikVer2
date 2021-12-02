create database testmergetable;
use testmergetable;
CREATE TABLE `Leaveofabsence_table` (
	`nik` varchar(255) NOT NULL, 
  `leave_id` int(2) NOT NULL,
  `type_of_leave` varchar(50) NOT NULL,
  `amount_of_leave` int(2) NOT NULL
  
) ENGINE=InnoDB DEFAULT CHARSET=latin1;


INSERT INTO `Leaveofabsence_table` (`nik`,`leave_id`, `type_of_leave`, `amount_of_leave`) VALUES
('1',1, 'Emergency Leave', 0),
('2',2, 'Bereavement', 0),
('3',3, 'Medical Leave', 0),
('4',4, 'Maternity/Paternity Leave', 0),
('5',5, 'Marriage Leave', 0),
('6',6, 'Annual Leave', 12);

CREATE TABLE `Company_Structure` (
	`nik` varchar(255)  NULL,
    `id` varchar(255) NOT NULL,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `pos_id` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
CREATE TABLE `Position`(
`pos_id` varchar(255) not null,
`position_name` long not null
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
INSERT INTO `Position` (`pos_id`,`position_name`) VALUES
(1,'Ketua Pembina'),
(2,'Ketua Yayasan STMIK'),
(3,'Ketua STMIK'),
(4,'PUKET I Akademik'),
(5,'Sekretaris & Forlap'),
(6,'PUKET II Non Akademik'),
(7,'PUKET III Kemahasiswaan'),
(8,'Kaprodi S1'),
(9,'Tim dosen S1'),
(10,'LPPM'),
(11,'Librarian'),
(12,'Admin Keuangan'),
(13,'Marketing'),
(14,'OB & GA');
INSERT INTO `Company_Structure` (`nik`,`id`, `first_name`, `last_name`,`pos_id`) VALUES
('11',1, 'Jimmy', 'Oentoro',1),
('12',2, 'Daniel', 'Runtuwene',2),
('13',3, 'Yoas', 'Arnest',3),
('14',4, 'Alfredo', 'Pasaribu',4),
('15',5, 'Yunus', 'Aprianus',5),
('16',6, 'Valeria', 'Sonata',6),
('17',7, 'Sartono', '',7),
('18',8, 'Alfredo', 'Pasaribu',8),
('19',9, 'Tim dosen S1', '',9),
('20',10, 'Anton', 'Rustam',10),
('21',11, 'Shesy', 'Hirawistya',11),
('22',12, 'Clarisa', 'Elizabeth',12),
('23',13, 'Lisa', 'Pitaloka',13),
('24',14, 'Imam', 'Perdi Rizal',14);

select company_structure.first_name, company_structure.last_name, position.position_name, company_structure.pos_id,
Leaveofabsence_table.leave_id
from company_structure, position, Leaveofabsence_table
where company_structure.pos_id=position.pos_id
order by company_structure.first_name;
CREATE TABLE `Pktable`(
`pktables_id` varchar(255) not null,
`company_structure_nik` varchar(255) not null,
`leaveofabsence_table_nik` varchar(255) not null,
`position_pos_id` varchar(255) not null,
`class_id` varchar(255) not null
)ENGINE=InnoDB DEFAULT CHARSET=latin1;

CREATE TABLE `Class`(
`class_id` varchar(255) not null,
`pic id` varchar(255) not null,
`pic name` varchar(255) not null,
`class name` varchar(255) not null
)ENGINE=InnoDB DEFAULT CHARSET=latin1;
-- hierarchy pengganti company structure, pktable(primary key table)
-- untuk menggunakan script diperlukanya dipastikan disamakan nama database
-- di mysql dan di application properties springboot lalu di bentuk terlebih dahulu database baru menjalankan springboot.



