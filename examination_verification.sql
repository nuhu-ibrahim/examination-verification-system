-- phpMyAdmin SQL Dump
-- version 4.6.5.2
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Nov 30, 2017 at 11:47 AM
-- Server version: 10.1.21-MariaDB
-- PHP Version: 7.1.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `examination_verification`
--

-- --------------------------------------------------------

--
-- Table structure for table `exam_info`
--

CREATE TABLE `exam_info` (
  `exam_id` varchar(100) NOT NULL,
  `course_title` varchar(100) NOT NULL,
  `course_code` varchar(100) NOT NULL,
  `exam_date` date NOT NULL,
  `start_time` time NOT NULL,
  `end_time` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam_info`
--

INSERT INTO `exam_info` (`exam_id`, `course_title`, `course_code`, `exam_date`, `start_time`, `end_time`) VALUES
('COSC202/2017', 'Introduction to Programing', 'COSC202', '2017-11-07', '00:00:00', '01:56:12'),
('COSC301/2017', 'Data Structure and algorithms', 'COSC301', '2017-11-16', '02:07:00', '17:45:00'),
('COSC401/2017', 'Analysis of Algorithms', 'COSC401', '2017-11-17', '11:57:01', '13:00:00'),
('COSC404/2017', 'Analysis of Algoorithms', 'COSC407', '2017-11-27', '11:26:00', '12:37:00');

-- --------------------------------------------------------

--
-- Table structure for table `exam_sign_in`
--

CREATE TABLE `exam_sign_in` (
  `exam_id` varchar(100) NOT NULL,
  `reg_no` varchar(100) NOT NULL,
  `sign_in_time` datetime NOT NULL,
  `sign_out_time` datetime NOT NULL,
  `sign_in` varchar(100) NOT NULL,
  `sign_out` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam_sign_in`
--

INSERT INTO `exam_sign_in` (`exam_id`, `reg_no`, `sign_in_time`, `sign_out_time`, `sign_in`, `sign_out`) VALUES
('COSC202/2017', 'U15cs2021', '2017-11-07 16:58:50', '2017-11-07 18:09:06', '', ''),
('COSC301/2017', 'U15CS2021', '2017-11-07 16:40:18', '2017-11-07 18:09:06', '', ''),
('nnnnnn', 'U15CS2021', '2017-11-09 03:03:42', '2017-11-09 03:04:25', '03:03:42', '05:00:00'),
('ycjhv ', 'u15cs2021', '2017-11-15 22:30:21', '2017-11-15 23:20:00', '22:30:21', '23:20:00'),
('ycjhv ', 'u15cs2098', '2017-11-15 22:31:27', '2017-11-15 23:20:00', '22:31:27', '23:20:00'),
('COSC301/2017', 'kptcst101764', '2017-11-16 15:12:24', '2017-11-16 15:24:06', '15:12:24', '15:24:06'),
('COSC404/2017', 'U15cs2021', '2017-11-27 11:26:57', '2017-11-27 12:37:00', '11:26:57', '12:37:00');

-- --------------------------------------------------------

--
-- Table structure for table `exam_sign_out`
--

CREATE TABLE `exam_sign_out` (
  `reg_no` varchar(100) NOT NULL,
  `exam_id` varchar(100) NOT NULL,
  `has_sign_out` int(100) NOT NULL DEFAULT '1'
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `exam_sign_out`
--

INSERT INTO `exam_sign_out` (`reg_no`, `exam_id`, `has_sign_out`) VALUES
('U15CS2021', 'COSC202/2017', 1),
('U15CS2021', 'COSC301/2017', 1),
('U15CS2021', 'nnnnnn', 1),
('kptcst101764', 'COSC301/2017', 1);

-- --------------------------------------------------------

--
-- Table structure for table `lecturer_bio`
--

CREATE TABLE `lecturer_bio` (
  `staff_id` varchar(400) NOT NULL,
  `bio` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer_bio`
--

INSERT INTO `lecturer_bio` (`staff_id`, `bio`) VALUES
('U15cs2021', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\U15CS2098.fpt'),
('u15cs2022', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\u15cs2022.fpt'),
('u15cs2023', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\u15cs2023.fpt'),
('zyetrhxgchv', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\zyetrhxgchv.fpt');

-- --------------------------------------------------------

--
-- Table structure for table `lecturer_info`
--

CREATE TABLE `lecturer_info` (
  `staff_id` varchar(40) NOT NULL,
  `fname` varchar(40) NOT NULL,
  `mname` varchar(40) NOT NULL,
  `lname` varchar(40) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(20) NOT NULL,
  `address` varchar(400) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `lecturer_info`
--

INSERT INTO `lecturer_info` (`staff_id`, `fname`, `mname`, `lname`, `dob`, `gender`, `address`) VALUES
('U15CS2021', 'Ibrahim', '', 'Nuhu', '2017-11-07', 'Male', 'unguan muazu'),
('u15cs2022', 'Ibrahim', '', 'Nuhu', '2017-11-17', 'Male', 'trghgxdfiukjv '),
('u15cs2023', 'sedfgvhbjkm', '', 'asd ghj', '2017-11-10', 'Male', 'sezrxtcyvubhjn'),
('zyetrhxgchv', 'gfgchv ', '', 'dhg jh', '2017-11-11', 'Male', 'd gjhm');

-- --------------------------------------------------------

--
-- Table structure for table `student_bio`
--

CREATE TABLE `student_bio` (
  `reg_no` varchar(100) NOT NULL,
  `bio` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_bio`
--

INSERT INTO `student_bio` (`reg_no`, `bio`) VALUES
('KPTCST101764', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\KPTCST101764.fpt'),
('U15CS2021', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\U15CS2021.fpt'),
('U15CS2098', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\U15CS2098.fpt'),
('weasf', 'C:\\Users\\USER\\Documents\\NetBeansProjects\\Examination Screening System\\src\\com\\passport\\weasf.fpt');

-- --------------------------------------------------------

--
-- Table structure for table `student_info`
--

CREATE TABLE `student_info` (
  `reg_no` varchar(100) NOT NULL,
  `fname` varchar(100) NOT NULL,
  `mname` varchar(100) NOT NULL,
  `lname` varchar(100) NOT NULL,
  `dob` date NOT NULL,
  `gender` varchar(100) NOT NULL,
  `mstatus` varchar(100) NOT NULL,
  `address` text NOT NULL,
  `dept` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_info`
--

INSERT INTO `student_info` (`reg_no`, `fname`, `mname`, `lname`, `dob`, `gender`, `mstatus`, `address`, `dept`) VALUES
('KPTCST101764', 'Muhammad', '', 'Abdullahi', '1996-02-07', 'Male', 'Single', 'Ubguan Muazu Kaduna', 'Biochemistry'),
('U15CS2021', 'Nuhu', '', 'Ibrahim', '1996-00-07', 'Male', 'Single', 'No 5, School Road,Unguan Muazu Kaduna', 'Mathematical Science'),
('U15CS2090\r\n', 'Abdullahi', '', 'Lawal', '2017-11-02', 'Male', 'Married', 'Tudun Wada Kaduna', 'Biological Science'),
('U15CS2098', 'Abdullahi', '', 'Lawal', '2017-11-02', 'Male', 'Married', 'Tudun Wada Kaduna', 'Biological Science'),
('weasf', 'uvkjdsbf', 'uibkjdfc', 'uibkjdv', '2017-11-02', 'Male', 'Single', 'fsv', 'Biochemistry');

-- --------------------------------------------------------

--
-- Table structure for table `student_pass`
--

CREATE TABLE `student_pass` (
  `reg_no` varchar(100) NOT NULL,
  `passport` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `student_pass`
--

INSERT INTO `student_pass` (`reg_no`, `passport`) VALUES
('KPTCST101764', 'C:\\Users\\USER\\Documents\\Data\\Passport\\Photo231.jpg'),
('RYXHFC', 'C:\\Users\\USER\\Documents\\Data\\Passport\\Photo231.jpg'),
('U15CS2021', 'C:\\Users\\USER\\Documents\\Data\\Passport\\Photo231.jpg'),
('U15CS2098', 'C:\\Users\\USER\\Documents\\Data\\Passport\\Photo0241.jpg'),
('weasf', 'C:\\Users\\USER\\Documents\\Data\\Passport\\Photo231.jpg');

-- --------------------------------------------------------

--
-- Table structure for table `user`
--

CREATE TABLE `user` (
  `Surname` varchar(100) NOT NULL,
  `Firstname` varchar(100) NOT NULL,
  `Username` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Usertype` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `user`
--

INSERT INTO `user` (`Surname`, `Firstname`, `Username`, `Password`, `Usertype`) VALUES
('Ibrahim', 'Nuhu', 'nuhu', 'nuhu', 'TECH USER'),
('Ibrahim', 'Nuhu', 'U15CS2021', '123456', 'EXAMINER'),
('Ibrahim', 'Nuhu', 'u15cs2022', 'Ibrahim', 'EXAMINER'),
('sedfgvhbjkm', 'asd ghj', 'u15cs2023', 'sedfgvhbjkm', 'EXAMINER'),
('gfgchv ', 'dhg jh', 'zyetrhxgchv', 'gfgchv ', 'EXAMINER');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `exam_info`
--
ALTER TABLE `exam_info`
  ADD PRIMARY KEY (`exam_id`);

--
-- Indexes for table `lecturer_info`
--
ALTER TABLE `lecturer_info`
  ADD PRIMARY KEY (`staff_id`);

--
-- Indexes for table `student_bio`
--
ALTER TABLE `student_bio`
  ADD PRIMARY KEY (`reg_no`);

--
-- Indexes for table `student_info`
--
ALTER TABLE `student_info`
  ADD PRIMARY KEY (`reg_no`);

--
-- Indexes for table `student_pass`
--
ALTER TABLE `student_pass`
  ADD PRIMARY KEY (`reg_no`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
