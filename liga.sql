-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 30-Maio-2017 às 14:20
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `liga`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `jogador`
--

CREATE TABLE `jogador` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL,
  `altura` double NOT NULL,
  `peso` double NOT NULL,
  `pe_chute` varchar(9) NOT NULL,
  `pontuacao` double NOT NULL,
  `time_id` int(11) NOT NULL,
  `idade` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `jogador`
--

INSERT INTO `jogador` (`id`, `nome`, `altura`, `peso`, `pe_chute`, `pontuacao`, `time_id`, `idade`) VALUES
(27, 'Balbuena', 1.74, 75, 'Direito', 5.93, 25, 25),
(28, 'Cassio', 1.9, 80, 'Direito', 6.92, 25, 29),
(29, 'Danilo', 1.83, 78, 'Direito', 5.71, 25, 37),
(30, 'Romero', 1.63, 62, 'Esquerdo', 5.44, 25, 24),
(32, 'Lugano', 1.88, 80, 'Direito', 4.3, 29, 36),
(33, 'Felipe Melo', 1.83, 80, 'Direito', 4, 26, 33),
(34, 'Johnny', 1.7, 70, 'Esquerdo', 5, 39, 31);

-- --------------------------------------------------------

--
-- Estrutura da tabela `time`
--

CREATE TABLE `time` (
  `id` int(11) NOT NULL,
  `nome` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Extraindo dados da tabela `time`
--

INSERT INTO `time` (`id`, `nome`) VALUES
(25, 'Corinthians'),
(26, 'Palmeiras'),
(27, 'Santos'),
(29, 'Sao Paulo'),
(32, 'Paulista'),
(33, 'Flamengo'),
(39, 'Paulista');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `jogador`
--
ALTER TABLE `jogador`
  ADD PRIMARY KEY (`id`),
  ADD KEY `time_id_index` (`time_id`);

--
-- Indexes for table `time`
--
ALTER TABLE `time`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `jogador`
--
ALTER TABLE `jogador`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=35;
--
-- AUTO_INCREMENT for table `time`
--
ALTER TABLE `time`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=40;
--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `jogador`
--
ALTER TABLE `jogador`
  ADD CONSTRAINT `fk_time_id` FOREIGN KEY (`time_id`) REFERENCES `time` (`id`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
