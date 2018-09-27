-- phpMyAdmin SQL Dump
-- version 4.8.2
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Sep 27, 2018 at 06:36 AM
-- Server version: 10.1.34-MariaDB
-- PHP Version: 7.2.7

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `liberaries`
--

-- --------------------------------------------------------

--
-- Table structure for table `addresses`
--

CREATE TABLE `addresses` (
  `address_id` bigint(20) NOT NULL,
  `city` varchar(45) DEFAULT NULL,
  `country` varchar(45) DEFAULT NULL,
  `line_1_number_building` varchar(45) DEFAULT NULL,
  `line_2_number_streest` varchar(45) DEFAULT NULL,
  `line_3_area_locality` varchar(45) DEFAULT NULL,
  `orther_address_details` varchar(45) DEFAULT NULL,
  `state_provice_county` varchar(45) DEFAULT NULL,
  `zip_postcode` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `anazone_book`
--

CREATE TABLE `anazone_book` (
  `isbn` bigint(20) NOT NULL,
  `amazoe_price` varchar(45) DEFAULT NULL,
  `amazone_star_rating` varchar(45) DEFAULT NULL,
  `authors` datetime DEFAULT NULL,
  `data_of_publication` varchar(45) DEFAULT NULL,
  `list_price` varchar(45) DEFAULT NULL,
  `pulishser` tinyint(4) DEFAULT NULL,
  `title` varchar(45) DEFAULT NULL,
  `your_saving` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `authors`
--

CREATE TABLE `authors` (
  `author_id` bigint(20) NOT NULL,
  `author_first_name` varchar(45) DEFAULT NULL,
  `author_last_name` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `isbn` bigint(20) NOT NULL,
  `book_title` varchar(45) DEFAULT NULL,
  `data_of_publication` datetime DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`isbn`, `book_title`, `data_of_publication`) VALUES
(1, 'Quang Thai ', NULL),
(2, 'Quang Thai ', NULL),
(3, 'Quang Thai ', '1970-01-01 08:00:55');

-- --------------------------------------------------------

--
-- Table structure for table `books_by_author`
--

CREATE TABLE `books_by_author` (
  `authors_author_id` bigint(20) NOT NULL,
  `books_isbn` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `books_by_categories`
--

CREATE TABLE `books_by_categories` (
  `caregory_id` bigint(20) NOT NULL,
  `isbn` bigint(20) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `book_at_libraries`
--

CREATE TABLE `book_at_libraries` (
  `isbn` bigint(20) NOT NULL,
  `library_id` bigint(20) NOT NULL,
  `library_details` varchar(45) DEFAULT NULL,
  `library_name` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `categories`
--

CREATE TABLE `categories` (
  `caregory_id` bigint(20) NOT NULL,
  `category_name` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Dumping data for table `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(4),
(4),
(4),
(4),
(4),
(4);

-- --------------------------------------------------------

--
-- Table structure for table `libraries`
--

CREATE TABLE `libraries` (
  `library_id` bigint(20) NOT NULL,
  `address_id` bigint(20) NOT NULL,
  `library_details` varchar(45) DEFAULT NULL,
  `library_name` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `members`
--

CREATE TABLE `members` (
  `member_id` bigint(20) NOT NULL,
  `email_address` varchar(45) DEFAULT NULL,
  `gender` varchar(45) DEFAULT NULL,
  `membe_address_id` bigint(20) NOT NULL,
  `member_first_name` varchar(45) DEFAULT NULL,
  `member_last_name` varchar(45) DEFAULT NULL,
  `other_member_details` varchar(45) DEFAULT NULL,
  `phone_number` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `members_request`
--

CREATE TABLE `members_request` (
  `request_id` bigint(20) NOT NULL,
  `books_isbn` bigint(20) DEFAULT NULL,
  `data_requested` varchar(255) DEFAULT NULL,
  `date_located` varchar(45) DEFAULT NULL,
  `members_member_id` bigint(20) NOT NULL,
  `otherrequest_details` varchar(45) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `addresses`
--
ALTER TABLE `addresses`
  ADD PRIMARY KEY (`address_id`);

--
-- Indexes for table `anazone_book`
--
ALTER TABLE `anazone_book`
  ADD PRIMARY KEY (`isbn`);

--
-- Indexes for table `authors`
--
ALTER TABLE `authors`
  ADD PRIMARY KEY (`author_id`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD PRIMARY KEY (`isbn`);

--
-- Indexes for table `books_by_author`
--
ALTER TABLE `books_by_author`
  ADD PRIMARY KEY (`authors_author_id`,`books_isbn`);

--
-- Indexes for table `books_by_categories`
--
ALTER TABLE `books_by_categories`
  ADD PRIMARY KEY (`caregory_id`,`isbn`);

--
-- Indexes for table `book_at_libraries`
--
ALTER TABLE `book_at_libraries`
  ADD PRIMARY KEY (`isbn`,`library_id`);

--
-- Indexes for table `categories`
--
ALTER TABLE `categories`
  ADD PRIMARY KEY (`caregory_id`);

--
-- Indexes for table `libraries`
--
ALTER TABLE `libraries`
  ADD PRIMARY KEY (`library_id`);

--
-- Indexes for table `members`
--
ALTER TABLE `members`
  ADD PRIMARY KEY (`member_id`);

--
-- Indexes for table `members_request`
--
ALTER TABLE `members_request`
  ADD PRIMARY KEY (`request_id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
