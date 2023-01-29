SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `spring_jdbc`
--

CREATE TABLE `customer` (
  `cust_id` int(10) NOT NULL,
  `cust_name` varchar(100) NOT NULL,
  `cust_address` varchar(100) NOT NULL,
  `cust_age` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;


INSERT INTO `customer` (`cust_id`, `cust_name`, `cust_address`, `cust_age`) VALUES
(1, 'James Kusmambang', 'Bandung', 26);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`cust_id`);

