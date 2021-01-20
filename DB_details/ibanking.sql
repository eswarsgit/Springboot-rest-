-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Jan 20, 2021 at 02:12 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ibanking`
--

-- --------------------------------------------------------

--
-- Table structure for table `bcustomer`
--

DROP TABLE IF EXISTS `bcustomer`;
CREATE TABLE IF NOT EXISTS `bcustomer` (
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `age` int(3) NOT NULL,
  `accountnumber` int(50) NOT NULL,
  `createddate` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `pannumber` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=17 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `bcustomer`
--

INSERT INTO `bcustomer` (`Id`, `first_name`, `last_name`, `age`, `accountnumber`, `createddate`, `pannumber`) VALUES
(1, 'eswar', 'G', 35, 123456789, '2021-01-17 16:53:33', 'AAMPE2912M'),
(3, 'Mokesh', 'E', 10, 123456790, '2021-01-18 04:02:22', 'AAMPE2913M'),
(4, 'Pranesh', 'E', 12, 123456791, '2021-01-18 10:23:04', 'AAMPE2919M'),
(5, 'Pranesh', 'E', 12, 123456792, '2021-01-18 10:23:04', 'AAMPE2915M'),
(6, 'customer1', 'fist', 50, 123456793, '2021-01-18 10:57:31', 'AAMPE2922M'),
(7, 'customer1', 'fist', 50, 123456794, '2021-01-18 10:57:31', 'AAMPE29EEE'),
(8, 'Eswaran', 'Sasi', 25, 123456795, '2021-01-18 18:30:00', 'AAMPE2812M'),
(9, 'Eswaran', 'Sasi', 25, 123456796, '2021-01-19 09:08:34', 'AAMPE3812M'),
(10, 'Eswaran', 'Sasi', 25, 123456797, '2021-01-19 09:14:56', 'BAMPE3812M'),
(11, 'Eswar', 'Sasi', 25, 123456798, '2021-01-19 09:22:42', 'AAMPE2913'),
(12, 'Try1', 'try1', 1, 123456799, '2021-01-19 10:15:19', 'AAMGE2915M'),
(13, 'HCL', 'HCL1', 50, 123456800, '2021-01-20 09:54:26', 'AAM1E2912M'),
(14, 'HCL', 'HCL1', 50, 123456801, '2021-01-20 09:55:25', 'BAM1E2912M'),
(15, '', 'HCL1', 50, 123456802, '2021-01-20 09:57:15', ''),
(16, 'Jan20336', 'Wed', 20, 123456803, '2021-01-20 10:06:58', 'BMPE2912M');

-- --------------------------------------------------------

--
-- Table structure for table `transaction`
--

DROP TABLE IF EXISTS `transaction`;
CREATE TABLE IF NOT EXISTS `transaction` (
  `accountnumber` int(50) NOT NULL,
  `accountbalance` int(50) NOT NULL DEFAULT '0',
  `accountdesc` varchar(500) NOT NULL,
  `txndate` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP,
  `Id` int(10) NOT NULL AUTO_INCREMENT,
  `current_rec` varchar(1) NOT NULL DEFAULT 'C',
  PRIMARY KEY (`Id`)
) ENGINE=MyISAM AUTO_INCREMENT=33 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`accountnumber`, `accountbalance`, `accountdesc`, `txndate`, `Id`, `current_rec`) VALUES
(123456790, 90, ' Deducted the Amount : 10-- For Transfer--123456789', '2021-01-17 17:17:37', 1, 'D'),
(123456789, 10, ' Added the Amount : 10-- From Transfer--123456790', '2021-01-17 17:18:20', 2, 'D'),
(123456797, 0, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-19 09:14:56', 3, 'C'),
(123456798, 100, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-19 09:22:43', 4, 'C'),
(123456799, 100, ' Added the Amount : 100-- From Transfer--123456789', '2021-01-19 10:15:19', 5, 'D'),
(123456790, 80, ' Deducted the Amount : 10-- For Transfer--123456789', '2021-01-19 16:07:33', 6, 'D'),
(123456789, 10, ' Added the Amount : 10-- From Transfer--123456790', '2021-01-19 16:07:34', 7, 'D'),
(123456799, 90, ' Deducted the Amount : 10-- For Transfer--123456798', '2021-01-19 16:45:22', 8, 'C'),
(123456790, 70, ' Deducted the Amount : 10-- For Transfer--123456789', '2021-01-20 08:01:38', 10, 'D'),
(123456789, 10, ' Added the Amount : 10-- From Transfer--123456790', '2021-01-20 08:01:39', 11, 'D'),
(123456790, 60, ' Deducted the Amount : 10-- For Transfer--123456789', '2021-01-20 08:12:12', 12, 'D'),
(123456789, 10, ' Added the Amount : 10-- From Transfer--123456790', '2021-01-20 08:12:12', 13, 'D'),
(123456789, 5, ' Deducted the Amount : 5-- For Transfer--123456790', '2021-01-20 08:15:38', 14, 'D'),
(123456790, 5, ' Added the Amount : 5-- From Transfer--123456789', '2021-01-20 08:15:38', 15, 'D'),
(123456789, 3, ' Deducted the Amount : 2-- For Transfer--123456790', '2021-01-20 08:18:58', 16, 'D'),
(123456789, 99998, ' Deducted the Amount : 2-- For Transfer--123456790', '2021-01-20 09:17:21', 19, 'D'),
(123456789, 100000, ' Deducted the Amount : 2-- For Transfer--123456790', '2021-01-20 09:06:48', 18, 'D'),
(123456790, 2, ' Added the Amount : 2-- From Transfer--123456789', '2021-01-20 09:17:21', 20, 'D'),
(123456789, 99996, ' Deducted the Amount : 2-- For Transfer--123456790', '2021-01-20 09:24:14', 21, 'D'),
(123456790, 2, ' Added the Amount : 2-- From Transfer--123456789', '2021-01-20 09:24:14', 22, 'D'),
(123456789, 99994, ' Deducted the Amount : 2-- For Transfer--123456790', '2021-01-20 09:24:22', 23, 'D'),
(123456790, 2, ' Added the Amount : 2-- From Transfer--123456789', '2021-01-20 09:24:22', 24, 'D'),
(123456789, 99992, ' Deducted the Amount : 2-- For Transfer--123456790', '2021-01-20 09:24:25', 25, 'D'),
(123456790, 2, ' Added the Amount : 2-- From Transfer--123456789', '2021-01-20 09:24:26', 26, 'D'),
(123456800, 0, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-20 09:54:27', 27, 'C'),
(123456801, 0, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-20 09:55:25', 28, 'C'),
(123456802, 0, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-20 09:57:16', 29, 'C'),
(123456803, 0, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-20 10:06:58', 30, 'C'),
(123456789, 99892, ' Deducted the Amount : 100-- For Transfer--123456790', '2021-01-20 10:10:23', 31, 'C'),
(123456790, 100, ' Added the Amount : 100-- From Transfer--123456789', '2021-01-20 10:10:23', 32, 'C');

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
