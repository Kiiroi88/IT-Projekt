CREATE TABLE `Order` (
  `ID` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ReferenceNumber` int(11) unsigned NOT NULL,
  `Unit` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Quantity` decimal(2,0) NOT NULL,
  `Amount` int(11) NOT NULL,
  `Price` decimal(2,0) NOT NULL,
  `Type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Space` int(11) NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `ID_UNIQUE` (`ID`),
  UNIQUE KEY `Varunamn_UNIQUE` (`Name`),
  UNIQUE KEY `Artikelnummer_UNIQUE` (`ReferenceNumber`),
  UNIQUE KEY `PlatsID_UNIQUE` (`Space`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;


CREATE TABLE `Product` (
  `ID` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `Name` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `ReferenceNumber` int(11) unsigned NOT NULL,
  `Unit` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Quantity` decimal(2,0) NOT NULL,
  `Amount` decimal(2,0) NOT NULL,
  `Price` decimal(6,0) NOT NULL,
  `Type` varchar(45) COLLATE utf8_unicode_ci NOT NULL,
  `Space` int(11) unsigned NOT NULL,
  PRIMARY KEY (`ID`),
  UNIQUE KEY `Artikelnummer_UNIQUE` (`ReferenceNumber`),
  UNIQUE KEY `PlatsID_UNIQUE` (`Space`)
) ENGINE=MyISAM AUTO_INCREMENT=44 DEFAULT CHARSET=utf8 COLLATE=utf8_unicode_ci;