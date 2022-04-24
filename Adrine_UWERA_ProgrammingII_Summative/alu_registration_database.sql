-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 23, 2022 at 05:31 PM
-- Server version: 10.4.22-MariaDB
-- PHP Version: 8.1.2

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `alu_registration_database`
--

-- --------------------------------------------------------

--
-- Table structure for table `applicants_table`
--

CREATE TABLE `applicants_table` (
  `studentRegistrationNumber` varchar(20) NOT NULL,
  `fullName` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `phoneNumber` bigint(20) NOT NULL,
  `countryOfResidence` varchar(255) NOT NULL,
  `nationality` varchar(255) NOT NULL,
  `campus` enum('Rwanda','Mauritius','','') NOT NULL,
  `intake` enum('January','September') NOT NULL,
  `grades` int(4) NOT NULL,
  `major` varchar(255) NOT NULL,
  `admissionStatus` enum('Pending','Admitted','Rejected') NOT NULL DEFAULT 'Pending'
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `applicants_table`
--

INSERT INTO `applicants_table` (`studentRegistrationNumber`, `fullName`, `email`, `phoneNumber`, `countryOfResidence`, `nationality`, `campus`, `intake`, `grades`, `major`, `admissionStatus`) VALUES
('2022/10', 'jah bless', 'j@gmail.com', 3245323234, 'rw', 'rw', 'Rwanda', 'September', 13, 'Business studies', 'Pending'),
('2022/11', 'kookie', 'k@gmail.com', 2923872, 'rw', 'rw', 'Rwanda', 'January', 14, 'Business studies', 'Admitted'),
('2022/12', 'maman adrine', 'm@gmail.com', 978232323, 'rw', 'rw', 'Rwanda', 'September', 19, 'Computer science', 'Rejected'),
('2022/13', 'adrien bro', 'adrien@gmail.com', 218734283, 'rw', 'rw', 'Mauritius', 'September', 18, 'Computer science', 'Pending'),
('2022/14', 'evelyne', 'eve@gmai.com', 38239842832, 'rw', 'rw', 'Mauritius', 'September', 14, 'Business studies', 'Pending'),
('2022/15', 'evelyne', 'eve@gmail.com', 923842032832, 'rw', 'rw', 'Mauritius', 'September', 17, 'Global challenges', 'Admitted'),
('2022/16', 'Giramata melissa', 'meli@gmail.com', 1234920823, 'rw', 'rw', 'Rwanda', 'January', 12, 'Business studies', 'Admitted'),
('2022/17', 'jessie umuhire', 'jessie@gmail.com', 8329382732983, 'rw', 'rw', 'Mauritius', 'January', 18, 'Computer science', 'Pending'),
('2022/18', 'parfine mizero', 'paru@gmail.com', 28392739283, 'rw', 'rw', 'Rwanda', 'January', 14, 'Business studies', 'Admitted'),
('2022/19', 'kelsy', 'keke@gmail.com', 89372832832, 'burundi', 'burundian', 'Mauritius', 'January', 14, 'Business studies', 'Admitted'),
('2022/6', 'Adrinette', 'adu@gmail.com', 785667788, 'rw', 'rw', 'Rwanda', 'January', 16, 'Global challenges', 'Admitted'),
('2022/7', 'adrine', 'adsu@gmail.com', 9038237291, 'rw', 'rw', 'Rwanda', 'September', 16, 'Global challenges', 'Pending'),
('2022/8', 'Paccy', 'pacici@gmail.com', 392038211, 'rw', 'rw', 'Rwanda', 'January', 16, 'Global challenges', 'Rejected'),
('2022/9', 'yobu', 'yir@gmail.com', 90382032333, 'rw', 'rw', 'Rwanda', 'January', 17, 'Global challenges', 'Rejected');

-- --------------------------------------------------------

--
-- Table structure for table `login_credentials_table`
--

CREATE TABLE `login_credentials_table` (
  `studentName` varchar(255) NOT NULL,
  `email` varchar(255) NOT NULL,
  `password` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `login_credentials_table`
--

INSERT INTO `login_credentials_table` (`studentName`, `email`, `password`) VALUES
('adrien', 'adrien@gmail.com', 'yeah'),
('has', 'adsu@gmail.com', '0987'),
('adrine', 'adu@gmail.com', '1234'),
('jdks', 'adus@gmail.com', 'wuqhw'),
('Betty', 'betty@yahoo.fr', 'betty'),
('doreen', 'd@gmail.com', 'adura'),
('evelyne', 'eve@gmail.com', 'petero'),
('JAHA', 'j@gmail.com', '2345'),
('jessie', 'jessie@gmail.com', 'jeshwi'),
('kok', 'k@gmail.com', '3456'),
('kelsy', 'keke@gmail.com', 'keke'),
('maman', 'm@gmail.com', '7890'),
('melissa', 'meli@gmail.com', 'giramata'),
('Paccy', 'pacici@gmail.com', '0987'),
('parfine', 'paru@gmail.com', 'missAlu'),
('vicky', 'v@gmail.com', '1704'),
('Job', 'yir@gmail.com', '4567');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `applicants_table`
--
ALTER TABLE `applicants_table`
  ADD PRIMARY KEY (`studentRegistrationNumber`),
  ADD UNIQUE KEY `email` (`email`);

--
-- Indexes for table `login_credentials_table`
--
ALTER TABLE `login_credentials_table`
  ADD PRIMARY KEY (`email`),
  ADD UNIQUE KEY `email` (`email`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
