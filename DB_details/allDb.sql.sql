-- phpMyAdmin SQL Dump
-- version 4.5.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 01, 2021 at 02:17 PM
-- Server version: 5.7.9
-- PHP Version: 5.6.15

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `empdb`
--
CREATE DATABASE IF NOT EXISTS `empdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `empdb`;

-- --------------------------------------------------------

--
-- Table structure for table `employee_details`
--

DROP TABLE IF EXISTS `employee_details`;
CREATE TABLE IF NOT EXISTS `employee_details` (
  `eid` int(10) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `age` int(10) NOT NULL,
  `pannumber` varchar(20) NOT NULL,
  `joiningdate` datetime DEFAULT CURRENT_TIMESTAMP,
  `address` varchar(250) NOT NULL,
  `createddate` datetime DEFAULT CURRENT_TIMESTAMP,
  `isManager` tinyint(1) NOT NULL DEFAULT '0',
  `is_manager` tinyint(1) NOT NULL DEFAULT '0',
  PRIMARY KEY (`eid`)
) ENGINE=MyISAM AUTO_INCREMENT=34 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `employee_details`
--

INSERT INTO `employee_details` (`eid`, `first_name`, `last_name`, `age`, `pannumber`, `joiningdate`, `address`, `createddate`, `isManager`, `is_manager`) VALUES
(33, 'Hcl', 'Chennai', 25, 'AAMPE291G', '2021-01-25 15:37:52', 'Testaddress', NULL, 0, 1),
(32, 'Eswar', 'G', 21, 'AAMPE2912C', '2021-01-22 17:03:05', 'adress1', NULL, 0, 1),
(31, 'Eswar', 'G', 21, 'AAMPE2912B', '2021-01-22 17:02:12', 'adress1', NULL, 0, 1),
(30, 'Eswar', 'G', 2, 'AAMPE2912A', '2021-01-12 16:59:33', 'adress1', NULL, 0, 1),
(29, 'Eswar', 'G', 2, 'AAMPE2912T', '2021-01-22 16:58:39', 'adress1', NULL, 0, 1),
(28, 'Eswar', 'G', 2, 'AAMPE2912R', '2021-01-22 16:14:11', 'adress1', NULL, 0, 1),
(27, 'Eswar', 'Sasi', 0, 'AAMPE29121', '2014-01-22 15:57:36', 'Address1', NULL, 0, 1),
(26, 'Eswar', 'Sasi', 0, 'AAMPE29127', '2021-01-12 15:56:47', 'Address1', NULL, 0, 0);

-- --------------------------------------------------------

--
-- Table structure for table `holiday`
--

DROP TABLE IF EXISTS `holiday`;
CREATE TABLE IF NOT EXISTS `holiday` (
  `id` bigint(32) UNSIGNED NOT NULL AUTO_INCREMENT,
  `hday` date NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

--
-- Dumping data for table `holiday`
--

INSERT INTO `holiday` (`id`, `hday`) VALUES
(1, '2021-01-26'),
(2, '2021-01-15'),
(3, '2021-01-26');
--
-- Database: `ibanking`
--
CREATE DATABASE IF NOT EXISTS `ibanking` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `ibanking`;

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
(1, 'Anjappar Hotel', 'Chennai', 35, 123456789, '2021-01-17 16:53:33', 'AAMPE2912M'),
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
) ENGINE=MyISAM AUTO_INCREMENT=98 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `transaction`
--

INSERT INTO `transaction` (`accountnumber`, `accountbalance`, `accountdesc`, `txndate`, `Id`, `current_rec`) VALUES
(123456790, 90, ' Deducted the Amount : 10-- For Transfer--123456789', '2021-01-17 17:17:37', 1, 'D'),
(123456789, 10, ' Added the Amount : 10-- From Transfer--123456790', '2021-01-17 17:18:20', 2, 'D'),
(123456797, 0, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-19 09:14:56', 3, 'D'),
(123456798, 100, 'This is Your Account Opening Entry so always Deposit amount is 0', '2021-01-19 09:22:43', 4, 'D'),
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
(123456789, 99892, ' Deducted the Amount : 100-- For Transfer--123456790', '2021-01-20 10:10:23', 31, 'D'),
(123456790, 100000, ' Added the Amount : 100-- From Transfer--123456789', '2021-01-20 10:10:23', 32, 'D'),
(123456789, 99467, ' Deducted the Amount : 425-- For Transfer--123456797', '2021-01-29 16:00:11', 33, 'D'),
(123456797, 425, ' Added the Amount : 425-- From Transfer--123456789', '2021-01-29 16:00:11', 34, 'D'),
(123456789, 99042, ' Deducted the Amount : 425-- For Transfer--123456797', '2021-01-29 16:03:28', 35, 'D'),
(123456797, 425, ' Added the Amount : 425-- From Transfer--123456789', '2021-01-29 16:03:28', 36, 'D'),
(123456789, 98617, ' Deducted the Amount : 425-- For Transfer--123456797', '2021-01-29 16:04:26', 37, 'D'),
(123456797, 425, ' Added the Amount : 425-- From Transfer--123456789', '2021-01-29 16:04:26', 38, 'D'),
(123456789, 98192, ' Deducted the Amount : 425-- For Transfer--123456797', '2021-01-29 16:08:47', 39, 'C'),
(123456790, 99575, ' Deducted the Amount : 425-- For Transfer--123456798', '2021-01-29 16:18:15', 40, 'D'),
(123456798, 525, ' Added the Amount : 425-- From Transfer--123456790', '2021-01-29 16:18:15', 41, 'D'),
(123456790, 99150, ' Deducted the Amount : 425-- For Transfer--123456798', '2021-01-29 16:18:18', 42, 'D'),
(123456798, 950, ' Added the Amount : 425-- From Transfer--123456790', '2021-01-29 16:18:18', 43, 'D'),
(123456790, 98725, ' Deducted the Amount : 425-- For Transfer--123456798', '2021-01-29 16:18:20', 44, 'D'),
(123456798, 1375, ' Added the Amount : 425-- From Transfer--123456790', '2021-01-29 16:18:20', 45, 'D'),
(123456790, 98300, ' Deducted the Amount : 425-- For Transfer--123456798', '2021-01-29 16:19:08', 46, 'D'),
(123456798, 1800, ' Added the Amount : 425-- From Transfer--123456790', '2021-01-29 16:19:08', 47, 'D'),
(123456790, 96900, ' Deducted the Amount : 1400-- For Transfer--123456798', '2021-02-01 08:11:15', 48, 'D'),
(123456798, 3200, ' Added the Amount : 1400-- From Transfer--123456790', '2021-02-01 08:11:15', 49, 'D'),
(123456790, 95500, ' Deducted the Amount : 1400-- For Transfer--123456798', '2021-02-01 08:11:31', 50, 'D'),
(123456798, 4600, ' Added the Amount : 1400-- From Transfer--123456790', '2021-02-01 08:11:31', 51, 'D'),
(123456790, 94100, ' Deducted the Amount : 1400-- For Transfer--123456798', '2021-02-01 08:17:08', 52, 'D'),
(123456798, 6000, ' Added the Amount : 1400-- From Transfer--123456790', '2021-02-01 08:17:08', 53, 'D'),
(123456790, 92700, ' Deducted the Amount : 1400-- For Transfer--123456798', '2021-02-01 08:17:58', 54, 'D'),
(123456798, 7400, ' Added the Amount : 1400-- From Transfer--123456790', '2021-02-01 08:17:58', 55, 'D'),
(123456790, 89350, ' Deducted the Amount : 3350-- For Transfer--123456798', '2021-02-01 08:21:22', 56, 'D'),
(123456798, 10750, ' Added the Amount : 3350-- From Transfer--123456790', '2021-02-01 08:21:22', 57, 'D'),
(123456790, 81125, ' Deducted the Amount : 8225-- For Transfer--123456798', '2021-02-01 08:22:24', 58, 'D'),
(123456798, 18975, ' Added the Amount : 8225-- From Transfer--123456790', '2021-02-01 08:22:24', 59, 'D'),
(123456790, 72900, ' Deducted the Amount : 8225-- For Transfer--123456798', '2021-02-01 08:24:13', 60, 'D'),
(123456798, 27200, ' Added the Amount : 8225-- From Transfer--123456790', '2021-02-01 08:24:13', 61, 'D'),
(123456790, 64675, ' Deducted the Amount : 8225-- For Transfer--123456798', '2021-02-01 08:30:22', 62, 'D'),
(123456798, 35425, ' Added the Amount : 8225-- From Transfer--123456790', '2021-02-01 08:30:22', 63, 'D'),
(123456790, 56450, ' Deducted the Amount : 8225-- For Transfer--123456798', '2021-02-01 08:32:10', 64, 'D'),
(123456798, 43650, ' Added the Amount : 8225-- From Transfer--123456790', '2021-02-01 08:32:10', 65, 'D'),
(123456790, 48225, ' Deducted the Amount : 8225-- For Transfer--123456798', '2021-02-01 08:39:26', 66, 'D'),
(123456798, 51875, ' Added the Amount : 8225-- From Transfer--123456790', '2021-02-01 08:39:26', 67, 'D'),
(123456790, 40000, ' Deducted the Amount : 8225-- For Transfer--123456798', '2021-02-01 08:42:57', 68, 'D'),
(123456798, 60100, ' Added the Amount : 8225-- From Transfer--123456790', '2021-02-01 08:42:57', 69, 'D'),
(123456790, 27775, ' Deducted the Amount : 12225-- For Transfer--123456798', '2021-02-01 08:51:13', 70, 'D'),
(123456798, 72325, ' Added the Amount : 12225-- From Transfer--123456790', '2021-02-01 08:51:13', 71, 'D'),
(123456790, 26375, ' Deducted the Amount : 1400-- For Transfer--123456798', '2021-02-01 09:45:38', 72, 'D'),
(123456798, 73725, ' Added the Amount : 1400-- From Transfer--123456790', '2021-02-01 09:45:38', 73, 'D'),
(123456790, 24975, ' Deducted the Amount : 1400-- For Transfer--123456798', '2021-02-01 09:45:41', 74, 'D'),
(123456798, 75125, ' Added the Amount : 1400-- From Transfer--123456790', '2021-02-01 09:45:41', 75, 'D'),
(123456790, 19925, ' Deducted the Amount : 5050-- For Transfer--123456798', '2021-02-01 09:45:57', 76, 'D'),
(123456798, 80175, ' Added the Amount : 5050-- From Transfer--123456790', '2021-02-01 09:45:57', 77, 'D'),
(123456790, 13125, ' Deducted the Amount : 6800-- For Transfer--123456798', '2021-02-01 09:46:17', 78, 'D'),
(123456798, 86975, ' Added the Amount : 6800-- From Transfer--123456790', '2021-02-01 09:46:17', 79, 'D'),
(123456790, 9850, ' Deducted the Amount : 3275-- For Transfer--123456798', '2021-02-01 09:58:06', 80, 'D'),
(123456798, 90250, ' Added the Amount : 3275-- From Transfer--123456790', '2021-02-01 09:58:06', 81, 'D'),
(123456790, 7245, ' Deducted the Amount : 2605-- For Transfer--123456798', '2021-02-01 09:58:25', 82, 'D'),
(123456798, 92855, ' Added the Amount : 2605-- From Transfer--123456790', '2021-02-01 09:58:25', 83, 'D'),
(123456790, 5090, ' Deducted the Amount : 2155-- For Transfer--123456798', '2021-02-01 09:58:35', 84, 'D'),
(123456798, 95010, ' Added the Amount : 2155-- From Transfer--123456790', '2021-02-01 09:58:35', 85, 'D'),
(123456790, 3605, ' Deducted the Amount : 1485-- For Transfer--123456798', '2021-02-01 09:58:45', 86, 'D'),
(123456798, 96495, ' Added the Amount : 1485-- From Transfer--123456790', '2021-02-01 09:58:45', 87, 'D'),
(123456790, 2680, ' Deducted the Amount : 925-- For Transfer--123456798', '2021-02-01 09:58:55', 88, 'D'),
(123456798, 97420, ' Added the Amount : 925-- From Transfer--123456790', '2021-02-01 09:58:55', 89, 'D'),
(123456790, 231500000, ' Deducted the Amount : 365-- For Transfer--123456798', '2021-02-01 09:59:03', 90, 'D'),
(123456798, 97785, ' Added the Amount : 365-- From Transfer--123456790', '2021-02-01 09:59:03', 91, 'D'),
(123456790, 231496835, ' Deducted the Amount : 3165-- For Transfer--123456798', '2021-02-01 10:00:44', 92, 'D'),
(123456798, 100950, ' Added the Amount : 3165-- From Transfer--123456790', '2021-02-01 10:00:44', 93, 'D'),
(123456790, 231493670, ' Deducted the Amount : 3165-- For Transfer--123456798', '2021-02-01 10:00:47', 94, 'D'),
(123456798, 104115, ' Added the Amount : 3165-- From Transfer--123456790', '2021-02-01 10:00:48', 95, 'D'),
(123456790, 231490720, ' Deducted the Amount : 2950-- For Transfer--123456798', '2021-02-01 12:02:23', 96, 'C'),
(123456798, 107065, ' Added the Amount : 2950-- From Transfer--123456790', '2021-02-01 12:02:23', 97, 'C');
--
-- Database: `orderdb`
--
CREATE DATABASE IF NOT EXISTS `orderdb` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `orderdb`;

-- --------------------------------------------------------

--
-- Table structure for table `menu`
--

DROP TABLE IF EXISTS `menu`;
CREATE TABLE IF NOT EXISTS `menu` (
  `menuid` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `item` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `Type` varchar(150) NOT NULL,
  PRIMARY KEY (`menuid`),
  UNIQUE KEY `menuid` (`menuid`),
  UNIQUE KEY `item` (`item`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu`
--

INSERT INTO `menu` (`menuid`, `item`, `price`, `Type`) VALUES
(1, 'Tomato Soup', 85, 'Started'),
(2, 'Hot & Sour Soup', 85, 'Started'),
(3, 'Roasted Papad', 15, 'Accompaniment'),
(4, 'Gobi 65', 205, 'Starter'),
(5, 'Dal Tadka', 145, 'Gravies'),
(6, 'Jeera Rice', 145, 'Rice & Noodles'),
(7, 'GobiManchurianGravy', 215, 'Gravies'),
(8, 'VegetableNoodles', 180, 'Rice & Noodles'),
(9, 'Phulka', 60, 'IndianBreads'),
(10, 'AlooParatha', 95, 'IndianBreads'),
(11, 'Veg-Briyani', 195, 'Briyani'),
(12, 'Chicken-Briyani', 295, 'Briyani'),
(13, 'Mutton-Briyani', 295, 'Briyani');

-- --------------------------------------------------------

--
-- Table structure for table `menu_list`
--

DROP TABLE IF EXISTS `menu_list`;
CREATE TABLE IF NOT EXISTS `menu_list` (
  `menuid` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `item` varchar(100) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `Type` varchar(150) NOT NULL,
  PRIMARY KEY (`menuid`),
  UNIQUE KEY `menuid` (`menuid`),
  UNIQUE KEY `item` (`item`)
) ENGINE=MyISAM AUTO_INCREMENT=14 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `menu_list`
--

INSERT INTO `menu_list` (`menuid`, `item`, `price`, `Type`) VALUES
(1, 'Tomato Soup', 85, 'Started'),
(2, 'Hot & Sour Soup', 85, 'Started'),
(3, 'Roasted Papad', 15, 'Accompaniment'),
(4, 'Gobi 65', 205, 'Starter'),
(5, 'Dal Tadka', 145, 'Gravies'),
(6, 'Jeera Rice', 145, 'Rice & Noodles'),
(7, 'GobiManchurianGravy', 215, 'Gravies'),
(8, 'VegetableNoodles', 180, 'Rice & Noodles'),
(9, 'Phulka', 60, 'IndianBreads'),
(10, 'AlooParatha', 95, 'IndianBreads'),
(11, 'Veg-Briyani', 195, 'Briyani'),
(12, 'Chicken-Briyani', 295, 'Briyani'),
(13, 'Mutton-Briyani', 295, 'Briyani');

-- --------------------------------------------------------

--
-- Table structure for table `order_details`
--

DROP TABLE IF EXISTS `order_details`;
CREATE TABLE IF NOT EXISTS `order_details` (
  `order_id` int(10) NOT NULL AUTO_INCREMENT,
  `cust_id` int(10) NOT NULL,
  `order_desc` varchar(250) NOT NULL,
  `order_quantity` int(10) NOT NULL,
  `rate_per_unit` int(10) NOT NULL,
  `order_amt` int(10) NOT NULL,
  `ordered_date` timestamp NULL DEFAULT CURRENT_TIMESTAMP,
  `order_txn_id` int(10) NOT NULL,
  PRIMARY KEY (`order_id`)
) ENGINE=MyISAM AUTO_INCREMENT=78 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `order_details`
--

INSERT INTO `order_details` (`order_id`, `cust_id`, `order_desc`, `order_quantity`, `rate_per_unit`, `order_amt`, `ordered_date`, `order_txn_id`) VALUES
(75, 101, '11', 11, 195, 2145, '2021-02-01 10:00:47', 46),
(74, 101, '1', 12, 85, 1020, '2021-02-01 10:00:47', 46),
(73, 101, '11', 11, 195, 2145, '2021-02-01 10:00:44', 45),
(72, 101, '1', 12, 85, 1020, '2021-02-01 10:00:44', 45),
(71, 101, '11', 11, 195, 2145, '2021-02-01 09:59:11', 44),
(70, 101, '1', 12, 85, 1020, '2021-02-01 09:59:11', 44),
(69, 101, '11', 1, 195, 195, '2021-02-01 09:59:03', 43),
(68, 101, '1', 2, 85, 170, '2021-02-01 09:59:03', 43),
(67, 101, '11', 3, 195, 585, '2021-02-01 09:58:55', 42),
(66, 101, '1', 4, 85, 340, '2021-02-01 09:58:55', 42),
(65, 101, '11', 5, 195, 975, '2021-02-01 09:58:45', 41),
(58, 101, '1', 11, 85, 935, '2021-02-01 09:58:06', 38),
(59, 101, '11', 12, 195, 2340, '2021-02-01 09:58:06', 38),
(60, 101, '1', 10, 85, 850, '2021-02-01 09:58:25', 39),
(61, 101, '11', 9, 195, 1755, '2021-02-01 09:58:25', 39),
(62, 101, '1', 7, 85, 595, '2021-02-01 09:58:34', 40),
(63, 101, '11', 8, 195, 1560, '2021-02-01 09:58:34', 40),
(64, 101, '1', 6, 85, 510, '2021-02-01 09:58:45', 41),
(76, 101, '12', 5, 295, 1475, '2021-02-01 12:02:20', 47),
(77, 101, '13', 5, 295, 1475, '2021-02-01 12:02:20', 47);

-- --------------------------------------------------------

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
CREATE TABLE IF NOT EXISTS `orders` (
  `orderId` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `userid` int(11) DEFAULT NULL,
  `total_amount` int(10) NOT NULL,
  `order_date` timestamp NULL DEFAULT NULL,
  PRIMARY KEY (`orderId`),
  UNIQUE KEY `orderId` (`orderId`)
) ENGINE=MyISAM AUTO_INCREMENT=48 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `orders`
--

INSERT INTO `orders` (`orderId`, `userid`, `total_amount`, `order_date`) VALUES
(39, 101, 2605, '2021-02-01 09:58:25'),
(40, 101, 2155, '2021-02-01 09:58:34'),
(41, 101, 1485, '2021-02-01 09:58:45'),
(42, 101, 925, '2021-02-01 09:58:55'),
(43, 101, 365, '2021-02-01 09:59:03'),
(44, 101, 3165, '2021-02-01 09:59:11'),
(45, 101, 3165, '2021-02-01 10:00:44'),
(46, 101, 3165, '2021-02-01 10:00:47'),
(47, 101, 2950, '2021-02-01 12:02:20'),
(38, 101, 3275, '2021-02-01 09:58:06');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

DROP TABLE IF EXISTS `users`;
CREATE TABLE IF NOT EXISTS `users` (
  `usrId` bigint(20) UNSIGNED NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `contact` varchar(10) DEFAULT NULL,
  `password` varchar(20) DEFAULT NULL,
  `role` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`usrId`),
  UNIQUE KEY `usrId` (`usrId`)
) ENGINE=MyISAM AUTO_INCREMENT=103 DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`usrId`, `username`, `email`, `contact`, `password`, `role`) VALUES
(101, 'Eswar', 'eswarjava@gmail.com', '9884667691', 'India@123', 'genuser'),
(102, 'Kumar', 'kumar@gmail.com', '9884667692', 'India@123', 'genuser');
--
-- Database: `usk`
--
CREATE DATABASE IF NOT EXISTS `usk` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `usk`;

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(10) NOT NULL DEFAULT '2',
  `first_name` varchar(50) NOT NULL,
  `last_name` varchar(50) NOT NULL,
  `age` int(10) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`id`, `first_name`, `last_name`, `age`) VALUES
(1, 'namefirst', 'Satjish', 12),
(1, 'namefirst', 'Satjish', 12),
(1, 'namefirst', 'Satjish222222', 12),
(1, 'namefirst', 'Satjish2222223333', 12),
(1, 'namefirst', 'Satjish5552', 12),
(1, 'namefirst', 'Satjish5566652', 12),
(1, 'namefirst', 'Satjish5566652', 12),
(1, 'namefirst', 'Satjish556776652', 12),
(1, 'namefirst', 'Satjish556776652', 12),
(2, 'namefirst', 'Satjish99999', 12);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
