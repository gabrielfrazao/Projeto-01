-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 28-Nov-2016 às 12:37
-- Versão do servidor: 5.7.14
-- PHP Version: 5.6.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `dbprontuarios`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `ficha`
--

CREATE TABLE `ficha` (
  `id` int(10) UNSIGNED NOT NULL,
  `idpaciente` int(10) UNSIGNED NOT NULL,
  `data` datetime DEFAULT NULL,
  `queixas` text NOT NULL,
  `sintomas` text NOT NULL,
  `habitos_alimentares` varchar(20) DEFAULT NULL,
  `cancer_familia` varchar(50) DEFAULT NULL,
  `mamografia` varchar(20) DEFAULT NULL,
  `protese` varchar(20) DEFAULT NULL,
  `alterecao_mamilo` varchar(100) DEFAULT NULL,
  `infomacoes` text
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `mamografia`
--

CREATE TABLE `mamografia` (
  `id` int(10) UNSIGNED NOT NULL,
  `idficha` int(10) UNSIGNED NOT NULL,
  `posicao` varchar(20) NOT NULL,
  `imagem` varchar(100) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `paciente`
--

CREATE TABLE `paciente` (
  `id` int(10) UNSIGNED NOT NULL,
  `prontuatio` varchar(20) NOT NULL,
  `nome` varchar(100) NOT NULL,
  `nome_mae` varchar(20) NOT NULL,
  `data_nascimento` datetime DEFAULT NULL,
  `estado_civil` varchar(20) DEFAULT NULL,
  `cor` varchar(20) DEFAULT NULL,
  `telefone` varchar(20) DEFAULT NULL,
  `fotografia` varchar(20) DEFAULT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Estrutura da tabela `usuario`
--

CREATE TABLE `usuario` (
  `id` int(10) UNSIGNED NOT NULL,
  `usuario` varchar(20) NOT NULL,
  `senha` varchar(20) NOT NULL,
  `tipo` varchar(20) NOT NULL,
  `repitasenha` varchar(30) NOT NULL
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `ficha`
--
ALTER TABLE `ficha`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idpaciente` (`idpaciente`);

--
-- Indexes for table `mamografia`
--
ALTER TABLE `mamografia`
  ADD PRIMARY KEY (`id`),
  ADD KEY `idficha` (`idficha`);

--
-- Indexes for table `paciente`
--
ALTER TABLE `paciente`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `usuario`
--
ALTER TABLE `usuario`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `ficha`
--
ALTER TABLE `ficha`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `mamografia`
--
ALTER TABLE `mamografia`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `paciente`
--
ALTER TABLE `paciente`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `usuario`
--
ALTER TABLE `usuario`
  MODIFY `id` int(10) UNSIGNED NOT NULL AUTO_INCREMENT;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
