USE [master]
GO
/****** Object:  Database [banhang]    Script Date: 8/24/2022 10:00:45 PM ******/
CREATE DATABASE [banhang]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'banhang', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.FANNABY\MSSQL\DATA\banhang.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'banhang_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL15.FANNABY\MSSQL\DATA\banhang_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
 WITH CATALOG_COLLATION = DATABASE_DEFAULT
GO
ALTER DATABASE [banhang] SET COMPATIBILITY_LEVEL = 150
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [banhang].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [banhang] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [banhang] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [banhang] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [banhang] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [banhang] SET ARITHABORT OFF 
GO
ALTER DATABASE [banhang] SET AUTO_CLOSE OFF 
GO
ALTER DATABASE [banhang] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [banhang] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [banhang] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [banhang] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [banhang] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [banhang] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [banhang] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [banhang] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [banhang] SET  ENABLE_BROKER 
GO
ALTER DATABASE [banhang] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [banhang] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [banhang] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [banhang] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [banhang] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [banhang] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [banhang] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [banhang] SET RECOVERY FULL 
GO
ALTER DATABASE [banhang] SET  MULTI_USER 
GO
ALTER DATABASE [banhang] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [banhang] SET DB_CHAINING OFF 
GO
ALTER DATABASE [banhang] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [banhang] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [banhang] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [banhang] SET ACCELERATED_DATABASE_RECOVERY = OFF  
GO
EXEC sys.sp_db_vardecimal_storage_format N'banhang', N'ON'
GO
ALTER DATABASE [banhang] SET QUERY_STORE = OFF
GO
USE [banhang]
GO
/****** Object:  Table [dbo].[Account]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account](
	[Account_ID] [int] IDENTITY(1,1) NOT NULL,
	[Username] [nvarchar](50) NOT NULL,
	[Password] [nvarchar](50) NOT NULL,
	[Full Name] [nvarchar](50) NOT NULL,
	[Email] [nvarchar](50) NULL,
	[Address] [nvarchar](max) NULL,
	[Phone] [nvarchar](50) NULL,
	[Role_ID] [int] NOT NULL,
 CONSTRAINT [PK_Account] PRIMARY KEY CLUSTERED 
(
	[Account_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account_Role]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account_Role](
	[Role_ID] [int] NOT NULL,
	[Role] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Role_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Account_Status]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Account_Status](
	[Status_ID] [int] NOT NULL,
	[Status] [nvarchar](10) NULL,
PRIMARY KEY CLUSTERED 
(
	[Status_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Category]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Category](
	[Category_ID] [int] IDENTITY(1,1) NOT NULL,
	[Category_Name] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Category_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Image]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Image](
	[Image_ID] [int] IDENTITY(1,1) NOT NULL,
	[Product_ID] [int] NOT NULL,
	[ImageURL] [nvarchar](max) NULL,
PRIMARY KEY CLUSTERED 
(
	[Image_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order](
	[Order_ID] [int] IDENTITY(1,1) NOT NULL,
	[Account_ID] [int] NOT NULL,
	[Total_Price] [float] NOT NULL,
	[Note] [nvarchar](max) NULL,
	[Create_Date] [date] NOT NULL,
	[Ship_ID] [int] NULL,
 CONSTRAINT [PK__Order__F1E4639B54788861] PRIMARY KEY CLUSTERED 
(
	[Order_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Order_Status]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Order_Status](
	[Status_ID] [int] NOT NULL,
	[Status] [nvarchar](50) NULL,
 CONSTRAINT [PK__Order_St__519009AC71140EB7] PRIMARY KEY CLUSTERED 
(
	[Status_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[OrderDetail]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[OrderDetail](
	[Detail_ID] [int] IDENTITY(1,1) NOT NULL,
	[Order_ID] [int] NOT NULL,
	[Product_Name] [nvarchar](max) NOT NULL,
	[Product_Image] [nvarchar](max) NULL,
	[Product_Price] [float] NULL,
	[Quantity] [int] NOT NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product](
	[Product_ID] [int] IDENTITY(1,1) NOT NULL,
	[Product_Code] [nvarchar](max) NULL,
	[Product_Name] [nvarchar](max) NULL,
	[Quantity] [int] NULL,
	[Price] [float] NULL,
	[Description] [nvarchar](max) NULL,
	[Image] [nvarchar](max) NULL,
	[Date] [date] NULL,
	[Status_ID] [nvarchar](max) NULL,
	[Subcategory_ID] [int] NULL,
	[Category_ID] [int] NULL,
 CONSTRAINT [PK__Product__9834FB9A25C97BDC] PRIMARY KEY CLUSTERED 
(
	[Product_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Product_Status]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Product_Status](
	[Status_ID] [int] NOT NULL,
	[Status_Name] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Status_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ship]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ship](
	[Ship_ID] [int] IDENTITY(1,1) NOT NULL,
	[Name] [nvarchar](max) NULL,
	[Phone] [nvarchar](max) NULL,
	[Address] [nvarchar](max) NULL,
	[Date] [datetime] NULL,
 CONSTRAINT [PK__Ship__58D0810BFEE25DB3] PRIMARY KEY CLUSTERED 
(
	[Ship_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Subcategory]    Script Date: 8/24/2022 10:00:45 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Subcategory](
	[Subcategory_ID] [int] NOT NULL,
	[Category_ID] [int] NOT NULL,
	[Subcategory_Name] [nvarchar](max) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[Subcategory_ID] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON, OPTIMIZE_FOR_SEQUENTIAL_KEY = OFF) ON [PRIMARY]
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
SET IDENTITY_INSERT [dbo].[Account] ON 

INSERT [dbo].[Account] ([Account_ID], [Username], [Password], [Full Name], [Email], [Address], [Phone], [Role_ID]) VALUES (1, N'', N'', N'', N'', N'', N'', 1)
INSERT [dbo].[Account] ([Account_ID], [Username], [Password], [Full Name], [Email], [Address], [Phone], [Role_ID]) VALUES (2, N'admin', N'123', N'Fannaby', N'namhocgioi2k1@gmail.com', N'Số 7 Hồ Thiền Quang', N'+84396373132', 0)
INSERT [dbo].[Account] ([Account_ID], [Username], [Password], [Full Name], [Email], [Address], [Phone], [Role_ID]) VALUES (6, N'tester', N'123', N'Phan Nam', N'Số 7 ngõ 73 Hoàng Ngân', N'namhocgioi2k1@gmail.com', N'+84396373132', 0)
INSERT [dbo].[Account] ([Account_ID], [Username], [Password], [Full Name], [Email], [Address], [Phone], [Role_ID]) VALUES (8, N'test1', N'123', N'Huy Tùng', N'tungnhhe150305@fpt.edu.vn', N'Hoàng Ngân', N'+390396373132', 1)
INSERT [dbo].[Account] ([Account_ID], [Username], [Password], [Full Name], [Email], [Address], [Phone], [Role_ID]) VALUES (9, N'man', N'man', N'Phạm Minh Man', N'namplhe153292@gmail.com', N'HoÃ ng NgÃ¢n - Thanh XuÃ¢n', N'+390396373132', 1)
INSERT [dbo].[Account] ([Account_ID], [Username], [Password], [Full Name], [Email], [Address], [Phone], [Role_ID]) VALUES (10, N'Linh', N'Linh', N'Linh', N'linhcutehehe@gmail.com', N'Myheart', N'1233', 1)
SET IDENTITY_INSERT [dbo].[Account] OFF
GO
INSERT [dbo].[Account_Role] ([Role_ID], [Role]) VALUES (0, N'admin')
INSERT [dbo].[Account_Role] ([Role_ID], [Role]) VALUES (1, N'user')
INSERT [dbo].[Account_Role] ([Role_ID], [Role]) VALUES (2, N'editer')
GO
INSERT [dbo].[Account_Status] ([Status_ID], [Status]) VALUES (0, N'Active')
INSERT [dbo].[Account_Status] ([Status_ID], [Status]) VALUES (1, N'Active')
INSERT [dbo].[Account_Status] ([Status_ID], [Status]) VALUES (2, N'Inactive')
GO
SET IDENTITY_INSERT [dbo].[Category] ON 

INSERT [dbo].[Category] ([Category_ID], [Category_Name]) VALUES (1, N'Sofa')
INSERT [dbo].[Category] ([Category_ID], [Category_Name]) VALUES (2, N'Papasan')
INSERT [dbo].[Category] ([Category_ID], [Category_Name]) VALUES (3, N'Giường')
INSERT [dbo].[Category] ([Category_ID], [Category_Name]) VALUES (4, N'Ghế mây đơn')
INSERT [dbo].[Category] ([Category_ID], [Category_Name]) VALUES (7, N'Vật dụng decor')
SET IDENTITY_INSERT [dbo].[Category] OFF
GO
SET IDENTITY_INSERT [dbo].[Order] ON 

INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (31, 1, 2490000, N'', CAST(N'2022-03-10' AS Date), 38)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (43, 1, 4980000, N'hihi', CAST(N'2022-03-10' AS Date), 45)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (44, 1, 4980000, N'Hehe', CAST(N'2022-03-13' AS Date), 46)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (45, 1, 4980000, N'Nhẹ tay', CAST(N'2022-03-13' AS Date), 47)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (46, 1, 2490000, N'Nhẹ tay pls', CAST(N'2022-03-13' AS Date), 48)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (47, 1, 0, N'nhẹ tay', CAST(N'2022-03-13' AS Date), 49)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (48, 1, 2490000, N'Nhẹ tay làm ơn', CAST(N'2022-03-13' AS Date), 50)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (49, 1, 0, N'nhẹ tay nha', CAST(N'2022-03-13' AS Date), 51)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (50, 1, 0, N'', CAST(N'2022-03-13' AS Date), 52)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (51, 1, 0, N'nhẹ tay dùm', CAST(N'2022-03-13' AS Date), 53)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (52, 1, 4980000, N'heheeeee', CAST(N'2022-03-15' AS Date), 54)
INSERT [dbo].[Order] ([Order_ID], [Account_ID], [Total_Price], [Note], [Create_Date], [Ship_ID]) VALUES (53, 1, 4980000, N'Nhe tay', CAST(N'2022-03-15' AS Date), 55)
SET IDENTITY_INSERT [dbo].[Order] OFF
GO
INSERT [dbo].[Order_Status] ([Status_ID], [Status]) VALUES (0, N'Inactive')
INSERT [dbo].[Order_Status] ([Status_ID], [Status]) VALUES (1, N'Active')
GO
SET IDENTITY_INSERT [dbo].[OrderDetail] ON 

INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (27, 43, N'Papasan  - Nệm nâu đất', N'2.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (28, 43, N'Papasan - Nệm xanh sáng', N'1.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (29, 44, N'Papasan  - Nệm nâu đất', N'2.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (30, 44, N'Papasan - Nệm xanh sáng', N'1.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (31, 45, N'Papasan  - Nệm nâu đất', N'2.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (32, 45, N'Papasan - Nệm xanh ngọc nhung', N'3.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (34, 48, N'Papasan - Nệm xanh sáng', N'1.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (15, 31, N'Papasan - Nệm xanh ngọc nhung', N'3.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (33, 46, N'Papasan - Nệm xanh cốm', N'5.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (37, 53, N'Papasan  - Nệm xám', N'8.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (38, 53, N'Papasan - Nệm xanh đậm', N'10.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (35, 52, N'Papasan  - Nệm xám', N'8.jpg', 2490000, 1)
INSERT [dbo].[OrderDetail] ([Detail_ID], [Order_ID], [Product_Name], [Product_Image], [Product_Price], [Quantity]) VALUES (36, 52, N'Papasan - Nệm kem sữa', N'7.jpg', 2490000, 1)
SET IDENTITY_INSERT [dbo].[OrderDetail] OFF
GO
SET IDENTITY_INSERT [dbo].[Product] ON 

INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (8, N'tn', N'Papasan - Nệm kem sữa', 6, 2490000, N'Size 100 / trắng', N'7.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (11, N'tn', N'Papasan - Nệm xanh đậm', 0, 2490000, N'Size 100 / tự nhiên', N'10.jpg', CAST(N'2022-02-22' AS Date), N'0', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (14, N'tn', N'Papasan - Nệm trắng ', 0, 2600000, N'Size 100 / tự nhiên', N'1a.jpg', CAST(N'2022-02-22' AS Date), N'0', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (15, N'tn', N'Papasan  - Nệm cam', 2, 2600000, N'Size 100 / tự nhiên', N'2a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (16, N'tn', N'Papasan - Nệm lá phong đỏ', 6, 2600000, N'Size 100 / choco', N'3a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (17, N'tn', N'Papasan - Nệm vàng', 0, 2600000, N'Size 100 / choco', N'4a.jpg', CAST(N'2022-02-22' AS Date), N'0', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (18, N'tn', N'Papasan  - Nệm trắng xanh', 5, 2600000, N'Size 100 / tự nhiên', N'5a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (19, N'tn', N'Papasan  - Nệm trắng đỏ', 3, 2600000, N'Size 100 / choco', N'6a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (20, N'tn', N'Papasan  - Nệm xanh đỏ', 1, 2600000, N'Size 100 / tự nhiên', N'7a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (21, N'tn', N'Papasan  - Nệm đỏ lục', 0, 2600000, N'Size 100 / choco', N'8a.jpg', CAST(N'2022-02-22' AS Date), N'0', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (22, N'tn', N'Papasan  - Nệm trắng hồng', 3, 2600000, N'Size 100 / tự nhiên', N'9a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (23, N'tn', N'Papasan  - Nệm đẹp', 12, 2600000, N'Size 100 / tự nhiên', N'10a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (24, N'tn', N'Papasan  - Nệm xanh hoạ tiết', 0, 2600000, N'Size 100 / tự nhiên', N'11a.jpg', CAST(N'2022-02-22' AS Date), N'0', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (25, N'tn', N'Papasan  - Nệm vàng', 16, 2600000, N'Size 100 / tự nhiên', N'12a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (26, N'tn', N'Papasan - Nệm cam đậm', 4, 2600000, N'Size 100 / tự nhiên', N'13a.jpg', CAST(N'2022-02-22' AS Date), N'1', 3, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (27, N'tn', N'Papasan - Nệm mặt đen', 9, 3500000, N'Size 100 / tự nhiên', N'14a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (28, N'tn', N'Papasan - Nệm trắng đẹp', 8, 3500000, N'Size 100 / choco', N'15a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (29, N'tn', N'Papasan  - Nệm cam nâu', 0, 3500000, N'Size 100 / tự nhiên', N'16a.jpg', CAST(N'2022-02-22' AS Date), N'0', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (30, N'tn', N'Papasan  - Nệm trắng nhung', 8, 3500000, N'Size 100 / tự nhiên', N'17a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (31, N'tn', N'Papasan  - Nệm xanh đỏ', 7, 3500000, N'Size 100 / tự nhiên', N'18a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (32, N'tn', N'Papasan  - Nệm xám vàng', 9, 3500000, N'Size 100 / choco', N'19a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (34, N'tn', N'Papasan - Nệm chấm bi', 0, 3500000, N'Size 100 / tự nhiên', N'21a.jpg', CAST(N'2022-02-22' AS Date), N'0', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (35, N'tn', N'Papasan - Nệm xanh vàng', 8, 3500000, N'Size 110 / tự nhiên', N'23a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (36, N'tn', N'Papasan - Nệm hoạ tiết trắng', 1, 3500000, N'Size 110 / choco', N'22a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (37, N'tn', N'Papasan - Nệm đỏ trắng', 0, 3500000, N'Size 110 / choco', N'24a.jpg', CAST(N'2022-02-22' AS Date), N'0', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (38, N'tn', N'Papasan - Nệm ngôi sao', 3, 3500000, N'Size 110 / choco', N'25a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (39, N'tn', N'Papasan - Nệm con công', 1, 3500000, N'Size 110 / choco', N'27a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (40, N'tn', N'Papasan - Nệm mặt trời', 0, 3800000, N'Size 110 / tự nhiên', N'28a.jpg', CAST(N'2022-02-22' AS Date), N'0', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (41, N'tn', N'papapsan110-bi15', 7, 3800000, N'Size 110 / choco', N'4.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (42, N'tn', N'Papasan - Nệm xanh', 1, 3800000, N'Size 110 / choco', N'1.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (43, N'tn', N'papapsan110-bi17', 4, 3800000, N'Size 110 / trắng', N'9.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (44, N'tn', N'papapsan110-bi18', 0, 3800000, N'Size 110 / tự nhiên', N'6.jpg', CAST(N'2022-02-22' AS Date), N'0', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (45, N'tn', N'papapsan110-bi19', 1, 3800000, N'Size 110 / tự nhiên', N'10a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (46, N'tn', N'papapsan110-bi20', 6, 3800000, N'Size 110 / tự nhiên', N'20a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (47, N'tn', N'papapsan110-bi21', 7, 3800000, N'Size 110 / choco', N'10.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (48, N'tn', N'papapsan110-bi22', 10, 3800000, N'Size 110 / choco', N'4a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (49, N'tn', N'papapsan110-bi23', 0, 3800000, N'Size 110 / tự nhiên', N'9a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (50, N'tn', N'papapsan110-bi24', 0, 3800000, N'Size 110 / tự nhiên', N'28a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (51, N'tn', N'papapsan110-bi25', 5, 3800000, N'Size 110 / tự nhiên', N'17a.jpg', CAST(N'2022-02-22' AS Date), N'1', 4, 2)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (52, N'tn', N'Sofa bèo m8x2m', 4, 12000000, N' sofa bèo m8x2m', N'v2.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (53, N'tn', N'Sofa bèo băng dài V4 m8x2m', 5, 12000000, N' sofa bèo m8x2m', N'v4.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (54, N'tn', N'Sofa bông sen', 7, 8600000, N'Sofa bông sen m4xm6', N'bongsen.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (55, N'tn', N'Nest Sofa mây 2 chỗ', 0, 12500000, N'40xm6x70', N'nest.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (56, N'tn', N'Sofa Daybed Queen Slander', 3, 13800000, N'40xm8x80', N'sofa1.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (57, N' tn', N'Sofa Mây Aysun Louge', 2, 8400000, N'50xm6x70', N'sofa2.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (58, N'tn', N'Sofa Mây Bella Donna', 6, 9200000, N'40xm6x70', N'sofa3.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (59, N'tn', N'Sofa Mây Blossom', 2, 8250000, N'40xm6x70', N'sofa4.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (60, N'tn', N'Sofa Mây Chalotten', 1, 8650000, N'40xm6x80', N'sofa5.jpg', CAST(N'2022-02-22' AS Date), N'1', 2, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (61, N'tn', N'Nest sofa mây đơn', 9, 620000, N'w50xh80', N'nest1.jpg', CAST(N'2022-02-22' AS Date), N'1', 1, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (62, N'tn', N' Sofa đơn Rattan M & Veins', 2, 650000, N'w50xh80', N'd1.jpg', CAST(N'2022-02-22' AS Date), N'1', 1, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (63, N'tn', N'Sofa Mây Pretzel (Đơn)', 1, 520000, N'Sofa mây Pretzel đơn: Đơn giản tạo nên sự khác biệt Những chiếc sofa đơn đã quá quen thuộc, trở thành một phần nội thất trong không gian của bạn, thì chiếc sofa mây pretzel đơn vẫn giữ nguyên nét quen thuộc ấy nhưng lại mang đến cảm giác hoàn toàn mới.', N'd2.png', CAST(N'2022-02-22' AS Date), N'1', 1, 1)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (64, N'tn', N'Bình Phong Mây Xinh 52
', 2, 4280000, N' Bình Phong Mây Xinh 52 giúp ngôi nhà trở nên tinh tế với nhiều kiểu dáng đa dạng. Bình Phong mây hiện nay được sử dụng làm vách ngăn cho nhiều không gian như phòng khách, phòng ngủ, phòng thay đồ, resort, quán cà phê,', N'bp4.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (65, N'tn', N'Bình Phong Mây Xinh 53', 0, 6400000, N'Cuộc sống có vô vàn những thay đổi, đặc biệt không gian sống cũng cần sáng tạo. Bình Phong Mây Xinh 53 giúp ngôi nhà trở nên tinh tế với nhiều kiểu dáng đa dạng', N'bp3.jpg', CAST(N'2022-02-22' AS Date), N'0', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (66, N'tn', N'Bình Phong Mây Xinh 54
', 1, 8200000, N'Bình Phong Mây Xinh 54 tô điểm cho nhiều không gian sống hiện đại với vô hàng hoạ tiết được người nghệ nhân tạo ra từ kinh nghiệm của mình.', N'bp2.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (67, N'tn', N'Bình Phong Mây Xinh 57', 3, 7650000, N'Bình Phong Mây Xinh 57 – Chiếc bình tạo điểm nhấn độc đáo với hoạ tiết đặc sắc vô cùng tinh tế khi bắt gặp giữa không gian ngôi nhà', N'bp1.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (69, N'tn', N'Đèn Mây Tre MXD15
', 10, 185000, N'
Đèn Mây Tre MXD15 được sản xuất tại Nhà Máy Mây Xinh bởi chất liệu tự nhiên, gần gũi với thiên nhiên và môi trường sống. Sản phẩm đạt tiêu chuẩn xuất khẩu Châu Âu và nhiều nước trên thế giới', N'den3.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (70, N'tn', N'Đèn MXD20
', 10, 185000, N'Đèn MXD20 được người thợ đan tỉ mỉ từ những sợi tre được trau chuốt cẩn thận. Mỗi sản phẩm được tạo bởi nhiều dáng hình phù hợp với nhiều không gian như: nhà hàng, khách sạn, resort, homestay', N'den4.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (71, N'tn', N'Đèn MXD15
', 10, 230000, N'Đèn MXD15 được người thợ đan tỉ mỉ từ những sợi tre được trau chuốt cẩn thận. Mỗi sản phẩm được tạo bởi nhiều dáng hình hiện đại, sang trọng phù hợp với nhiều không gian như: nhà hàng, khách sạn, resort, homestay,…', N'den2.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (72, N'tn', N'Đèn MXD09
', 10, 380000, N'Đèn MXD09 được người thợ đan tỉ mỉ từ những sợi tre được trau chuốt cẩn thận. Mỗi sản phẩm được tạo bởi nhiều dáng hình phù hợp với nhiều không gian như: nhà hàng, khách sạn, resort, homestay,…', N'den1.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 7)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (73, N'tn', N'Giường Mây Katsuki', 1, 8200000, N'Giường Mây Katsuki Trong cuộc sống hiện nay, giấc ngủ ngon tưởng chừng giản đơn, nhưng lại xa xĩ với nhiều người. Vì vậy, giường mây Katsuki là một trong những lựa chọn cho giấc ngủ ngon từ nội thất mây tre tự nhiên.', N'g1.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 3)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (74, N'tn', N'Giường Mây MXG09
', 1, 10800000, N'Trong cuộc sống hiện nay, giấc ngủ ngon tưởng chừng giản đơn, nhưng lại xa xĩ với nhiều người. Vì vậy, giường mây MXG09 là một trong những lựa chọn cho giấc ngủ ngon từ nội thất mây tre tự nhiên', N'g2.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 3)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (75, N'tn', N'Giường Mây Paris
', 1, 10800000, N'
Giường Mây Paris Giường Mây Paris mang phong cách Châu Âu giúp giấc ngủ của bạn ngon và sâu. Nội thất mây tre giúp bạn trải nghiệm không gian mộc mạc, gần gũi,… Nhu cầu thư giãn, đồng thời kết hợp những không gian sang trọng, tạo cảm giác dễ chịu. ', N'g3.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 3)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (76, N'tn', N'Giường Mây Avalon', 1, 12500000, N'Giường Mây Avalon Giường mây Avalon là  một trong những sản phẩn nội thất mây tre êm ái nhẹ nhàng để bạn thoải mái thả lưng sau một ngày dài với công việc. Mà còn giúp căn phòng của bạn trở nên tinh tế và trong sáng hơn.', N'g4.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 3)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (77, N'tn', N'Bugalow Sofa 1970s
', 3, 6400000, N'Những chiếc ghế mây đang ngày càng được nâng lên tầm mới, đặc biệt chiếc ghế mây Bugalow sofa 1970s. Những nghệ nhân luôn sáng tạo, tinh tế biến hoá hàng ngàn biến thể độc đáo từ những cây mây cát 15 tuổi', N'sofa6.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 4)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (78, N'tn', N'Ghế Mây Bali', 2, 3250000, N'Ghế mây Bali Ghế mây Bali sang trọng, tinh tế, phần nệm ghế cao cấp êm ái. Nội thất mây tre ưu Việt, hiện đại, thời thượng cho từng không gian', N'd3.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 4)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (79, N'tn', N'Ghế Mây Akit', 6, 5200000, N'
Ghế mây Akit Ghế mây Akit uốn lượn, mềm mại, ôm sát phần lưng giúp lưu thông máu, thư giãn toàn bộ cơ thể tôn lên vẻ đẹp ấn tượng cho nội thất mây tre', N'd4.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 4)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (80, N'tn', N'Ghế Mây Conte Biancamano', 5, 5800000, N'Ghế Mây Conte Biancamano – Câu chuyện ghế mây CONTE BIANCAMANO- DẤU ẤN CỦA NHỮNG CON SÓNG BIỂN Thuộc dòng ghế mây kinh điển, Conte Biancamano là chiếc ghế mang rất nhiều dấu ấn lịch sử', N'd6.jpg', CAST(N'2022-02-22' AS Date), N'1', NULL, 4)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (81, N'tn', N'Ghế Mây Con Công (Ghế Mây Peacock)
', 0, 8600000, N'Ghế Mây Con Công hay còn gọi là Peacock Chair, Wedding Chair (ghế sử dụng trong các sự kiện đám cưới). Từ xa xưa loài chim công được ca ngợi không chỉ từ vẻ đẹp mà còn có khí chất cao khiết.', N'd5.jpg', CAST(N'2022-02-22' AS Date), N'0', NULL, 4)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (82, NULL, N'Papasan test', 2, 123000, N'Nháº¹ tay thuii', NULL, CAST(N'2022-03-15' AS Date), NULL, 2, 3)
INSERT [dbo].[Product] ([Product_ID], [Product_Code], [Product_Name], [Quantity], [Price], [Description], [Image], [Date], [Status_ID], [Subcategory_ID], [Category_ID]) VALUES (83, NULL, N'Test1', 2, 123, N'Nhe tay', NULL, CAST(N'2022-03-15' AS Date), NULL, 1, 1)
SET IDENTITY_INSERT [dbo].[Product] OFF
GO
INSERT [dbo].[Product_Status] ([Status_ID], [Status_Name]) VALUES (0, N'Hết hàng')
INSERT [dbo].[Product_Status] ([Status_ID], [Status_Name]) VALUES (1, N'Còn hàng')
GO
SET IDENTITY_INSERT [dbo].[Ship] ON 

INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (38, N'', N'0', N'', CAST(N'2022-03-10T01:21:33.330' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (42, N'fannaby', N'396', N'HN', CAST(N'2022-03-10T03:15:52.537' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (44, N'nam', N'78', N'hehe', CAST(N'2022-03-10T03:24:01.160' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (45, N'Phan Lương Nam', N'+84396373132', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-10T03:25:33.827' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (46, N'Phan Lương Nam', N'+84396373132', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:11:16.763' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (47, N'Fannaby', N'0987654321', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:35:34.943' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (48, N'Fannaby', N'0987654321', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:36:31.337' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (49, N'Fannaby', N'0987654321', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:36:58.730' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (50, N'Fannaby', N'0987654321', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:38:15.563' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (51, N'Phan Lương Nam', N'+84396373132', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:38:59.190' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (52, N'', N'', N'', CAST(N'2022-03-13T23:42:39.880' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (53, N'Phan Lương Nam', N'+84396373132', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-13T23:46:47.537' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (54, N'Fannaby', N'0987654321', N'Hoàng Ngân - Thanh Xuân', CAST(N'2022-03-15T13:01:00.853' AS DateTime))
INSERT [dbo].[Ship] ([Ship_ID], [Name], [Phone], [Address], [Date]) VALUES (55, N'Phan Nam', N'0396373132', N'Hoa Lac', CAST(N'2022-03-15T16:20:14.927' AS DateTime))
SET IDENTITY_INSERT [dbo].[Ship] OFF
GO
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (1, 1, N'Sofa đơn')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (2, 1, N'Sofa dài')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (3, 2, N'Papasan 100')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (4, 2, N'Papasan 110')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (5, 5, N'Đôn tròn ')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (6, 5, N'Đôn')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (7, 4, N'Bàn mây')
INSERT [dbo].[Subcategory] ([Subcategory_ID], [Category_ID], [Subcategory_Name]) VALUES (8, 4, N'Ghế mây đơn')
GO
ALTER TABLE [dbo].[Order] ADD  CONSTRAINT [DF_Order_Create_Date]  DEFAULT (getdate()) FOR [Create_Date]
GO
ALTER TABLE [dbo].[Product] ADD  CONSTRAINT [DF_Product_Date]  DEFAULT (getdate()) FOR [Date]
GO
ALTER TABLE [dbo].[Ship] ADD  CONSTRAINT [DF_Ship_Date]  DEFAULT (getdate()) FOR [Date]
GO
ALTER TABLE [dbo].[Account]  WITH CHECK ADD  CONSTRAINT [fk_Account_id_Role] FOREIGN KEY([Role_ID])
REFERENCES [dbo].[Account_Role] ([Role_ID])
GO
ALTER TABLE [dbo].[Account] CHECK CONSTRAINT [fk_Account_id_Role]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [fk_Order_ID_account] FOREIGN KEY([Account_ID])
REFERENCES [dbo].[Account] ([Account_ID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [fk_Order_ID_account]
GO
ALTER TABLE [dbo].[Order]  WITH CHECK ADD  CONSTRAINT [fk_Order_SID_Ship] FOREIGN KEY([Ship_ID])
REFERENCES [dbo].[Ship] ([Ship_ID])
GO
ALTER TABLE [dbo].[Order] CHECK CONSTRAINT [fk_Order_SID_Ship]
GO
ALTER TABLE [dbo].[OrderDetail]  WITH CHECK ADD  CONSTRAINT [fk_Order_ID] FOREIGN KEY([Order_ID])
REFERENCES [dbo].[Order] ([Order_ID])
GO
ALTER TABLE [dbo].[OrderDetail] CHECK CONSTRAINT [fk_Order_ID]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [fk_Product_id] FOREIGN KEY([Subcategory_ID])
REFERENCES [dbo].[Subcategory] ([Subcategory_ID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [fk_Product_id]
GO
ALTER TABLE [dbo].[Product]  WITH CHECK ADD  CONSTRAINT [fk_Product_id_Cate] FOREIGN KEY([Category_ID])
REFERENCES [dbo].[Category] ([Category_ID])
GO
ALTER TABLE [dbo].[Product] CHECK CONSTRAINT [fk_Product_id_Cate]
GO
USE [master]
GO
ALTER DATABASE [banhang] SET  READ_WRITE 
GO
