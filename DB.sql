USE [master]
GO
/****** Object:  Database [QLRPhim]    Script Date: 2020-05-30 7:11:02 PM ******/
CREATE DATABASE [QLRPhim]
 CONTAINMENT = NONE
 ON  PRIMARY 
( NAME = N'QLRPhim', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\QLRPhim.mdf' , SIZE = 8192KB , MAXSIZE = UNLIMITED, FILEGROWTH = 65536KB )
 LOG ON 
( NAME = N'QLRPhim_log', FILENAME = N'C:\Program Files\Microsoft SQL Server\MSSQL14.SQLEXPRESS\MSSQL\DATA\QLRPhim_log.ldf' , SIZE = 8192KB , MAXSIZE = 2048GB , FILEGROWTH = 65536KB )
GO
ALTER DATABASE [QLRPhim] SET COMPATIBILITY_LEVEL = 140
GO
IF (1 = FULLTEXTSERVICEPROPERTY('IsFullTextInstalled'))
begin
EXEC [QLRPhim].[dbo].[sp_fulltext_database] @action = 'enable'
end
GO
ALTER DATABASE [QLRPhim] SET ANSI_NULL_DEFAULT OFF 
GO
ALTER DATABASE [QLRPhim] SET ANSI_NULLS OFF 
GO
ALTER DATABASE [QLRPhim] SET ANSI_PADDING OFF 
GO
ALTER DATABASE [QLRPhim] SET ANSI_WARNINGS OFF 
GO
ALTER DATABASE [QLRPhim] SET ARITHABORT OFF 
GO
ALTER DATABASE [QLRPhim] SET AUTO_CLOSE ON 
GO
ALTER DATABASE [QLRPhim] SET AUTO_SHRINK OFF 
GO
ALTER DATABASE [QLRPhim] SET AUTO_UPDATE_STATISTICS ON 
GO
ALTER DATABASE [QLRPhim] SET CURSOR_CLOSE_ON_COMMIT OFF 
GO
ALTER DATABASE [QLRPhim] SET CURSOR_DEFAULT  GLOBAL 
GO
ALTER DATABASE [QLRPhim] SET CONCAT_NULL_YIELDS_NULL OFF 
GO
ALTER DATABASE [QLRPhim] SET NUMERIC_ROUNDABORT OFF 
GO
ALTER DATABASE [QLRPhim] SET QUOTED_IDENTIFIER OFF 
GO
ALTER DATABASE [QLRPhim] SET RECURSIVE_TRIGGERS OFF 
GO
ALTER DATABASE [QLRPhim] SET  ENABLE_BROKER 
GO
ALTER DATABASE [QLRPhim] SET AUTO_UPDATE_STATISTICS_ASYNC OFF 
GO
ALTER DATABASE [QLRPhim] SET DATE_CORRELATION_OPTIMIZATION OFF 
GO
ALTER DATABASE [QLRPhim] SET TRUSTWORTHY OFF 
GO
ALTER DATABASE [QLRPhim] SET ALLOW_SNAPSHOT_ISOLATION OFF 
GO
ALTER DATABASE [QLRPhim] SET PARAMETERIZATION SIMPLE 
GO
ALTER DATABASE [QLRPhim] SET READ_COMMITTED_SNAPSHOT OFF 
GO
ALTER DATABASE [QLRPhim] SET HONOR_BROKER_PRIORITY OFF 
GO
ALTER DATABASE [QLRPhim] SET RECOVERY SIMPLE 
GO
ALTER DATABASE [QLRPhim] SET  MULTI_USER 
GO
ALTER DATABASE [QLRPhim] SET PAGE_VERIFY CHECKSUM  
GO
ALTER DATABASE [QLRPhim] SET DB_CHAINING OFF 
GO
ALTER DATABASE [QLRPhim] SET FILESTREAM( NON_TRANSACTED_ACCESS = OFF ) 
GO
ALTER DATABASE [QLRPhim] SET TARGET_RECOVERY_TIME = 60 SECONDS 
GO
ALTER DATABASE [QLRPhim] SET DELAYED_DURABILITY = DISABLED 
GO
ALTER DATABASE [QLRPhim] SET QUERY_STORE = OFF
GO
USE [QLRPhim]
GO
/****** Object:  Table [dbo].[HoaDon]    Script Date: 2020-05-30 7:11:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDon](
	[IDTK] [nvarchar](10) NOT NULL,
	[IDHoaDon] [nvarchar](10) NOT NULL,
	[TongTien] [float] NULL,
PRIMARY KEY CLUSTERED 
(
	[IDHoaDon] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[HoaDonChiTiet]    Script Date: 2020-05-30 7:11:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[HoaDonChiTiet](
	[IDHoaDon] [nvarchar](10) NULL,
	[IDVe] [nvarchar](10) NULL,
	[SoLuongMua] [int] NULL,
	[Gia] [float] NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[LichChieu]    Script Date: 2020-05-30 7:11:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[LichChieu](
	[IDLichChieu] [nvarchar](10) NOT NULL,
	[IDPhim] [nvarchar](10) NOT NULL,
	[GioChieu] [nvarchar](20) NOT NULL,
	[NgayChieu] [nvarchar](20) NULL,
PRIMARY KEY CLUSTERED 
(
	[IDLichChieu] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Phim]    Script Date: 2020-05-30 7:11:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Phim](
	[IDCumRap] [nvarchar](10) NOT NULL,
	[IDPhim] [nvarchar](10) NOT NULL,
	[TenPhim] [nvarchar](50) NOT NULL,
	[TheLoai] [nvarchar](50) NOT NULL,
	[DienVien] [nvarchar](30) NOT NULL,
	[DaoDien] [nvarchar](30) NOT NULL,
	[ThoiLuong] [nvarchar](10) NOT NULL,
	[HangPhim] [nvarchar](30) NOT NULL,
	[ThoiGianChieu] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDPhim] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[RapChieu]    Script Date: 2020-05-30 7:11:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[RapChieu](
	[IDCumRap] [nvarchar](10) NOT NULL,
	[TenRap] [nvarchar](30) NOT NULL,
	[DiaChiRap] [nvarchar](30) NOT NULL,
	[SoPhong] [int] NOT NULL,
	[SoGhe] [int] NOT NULL,
	[Facebook] [nvarchar](50) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDCumRap] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[TaiKhoan]    Script Date: 2020-05-30 7:11:02 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[TaiKhoan](
	[IDTK] [nvarchar](10) NOT NULL,
	[MatKhau] [varchar](20) NOT NULL,
	[HoTen] [nvarchar](30) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDTK] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[Ve]    Script Date: 2020-05-30 7:11:03 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[Ve](
	[IDPhim] [nvarchar](10) NOT NULL,
	[IDLichChieu] [nvarchar](10) NOT NULL,
	[IDVe] [nvarchar](10) NOT NULL,
	[ViTri] [nvarchar](10) NULL,
	[NgayChieu] [nvarchar](20) NULL,
	[GioChieu] [nvarchar](20) NOT NULL,
PRIMARY KEY CLUSTERED 
(
	[IDVe] ASC
)WITH (PAD_INDEX = OFF, STATISTICS_NORECOMPUTE = OFF, IGNORE_DUP_KEY = OFF, ALLOW_ROW_LOCKS = ON, ALLOW_PAGE_LOCKS = ON) ON [PRIMARY]
) ON [PRIMARY]
GO
INSERT [dbo].[HoaDon] ([IDTK], [IDHoaDon], [TongTien]) VALUES (N'ID01', N'HD07', 240000)
INSERT [dbo].[HoaDonChiTiet] ([IDHoaDon], [IDVe], [SoLuongMua], [Gia]) VALUES (N'HD07', N'MV01', 2, 45000)
INSERT [dbo].[HoaDonChiTiet] ([IDHoaDon], [IDVe], [SoLuongMua], [Gia]) VALUES (N'HD07', N'MV02', 1, 30000)
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC01', N'MP01', N'08:00', N'22/05/2020')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC02', N'MP01', N'10:20', N'22/05/2020')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC03', N'MP01', N'16:30', N'22/05/2020')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC04', N'MP01', N'20:40', N'22/05/2020')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC05', N'MP02', N'08:00', N'21/05/2021')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC06', N'MP02', N'09:00', N'21/05/2021')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC07', N'MP02', N'11:00', N'21/05/2021')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC08', N'MP02', N'14:00', N'21/05/2021')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC09', N'MP03', N'09:50', N'16/12/2022')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC10', N'MP03', N'10:30', N'16/12/2022')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC11', N'MP03', N'17:15', N'16/12/2022')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC12', N'MP03', N'21:40', N'16/12/2022')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC13', N'MP04', N'11:25', N'23/02/2018')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC14', N'MP04', N'15:00', N'23/02/2018')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC15', N'MP04', N'16:20', N'23/02/2018')
INSERT [dbo].[LichChieu] ([IDLichChieu], [IDPhim], [GioChieu], [NgayChieu]) VALUES (N'LC16', N'MP04', N'19:00', N'23/02/2018')
INSERT [dbo].[Phim] ([IDCumRap], [IDPhim], [TenPhim], [TheLoai], [DienVien], [DaoDien], [ThoiLuong], [HangPhim], [ThoiGianChieu]) VALUES (N'CR01', N'MP01', N'Fast & Furious 9', N'Hành Động', N'Vin Diesel', N'James Wan', N'136', N'Original Film', N'22/05/2020')
INSERT [dbo].[Phim] ([IDCumRap], [IDPhim], [TenPhim], [TheLoai], [DienVien], [DaoDien], [ThoiLuong], [HangPhim], [ThoiGianChieu]) VALUES (N'CR02', N'MP02', N'John Wick 4', N'Hành Động', N'Keanu Reeves', N'Chad Stahelski', N'131', N'Summit Entertainment', N'21/05/2021')
INSERT [dbo].[Phim] ([IDCumRap], [IDPhim], [TenPhim], [TheLoai], [DienVien], [DaoDien], [ThoiLuong], [HangPhim], [ThoiGianChieu]) VALUES (N'CR03', N'MP03', N'Aquaman 2', N'Hành Động', N'Jason Momoa', N'James Wan', N'143', N'Warner Bros. Pictures', N'16/12/2022')
INSERT [dbo].[Phim] ([IDCumRap], [IDPhim], [TenPhim], [TheLoai], [DienVien], [DaoDien], [ThoiLuong], [HangPhim], [ThoiGianChieu]) VALUES (N'CR04', N'MP04', N'Lady Bird', N'Hài', N'Saoirse Ronan', N'Greta Gerwig', N'94', N'IAC Films', N'23/02/2018')
INSERT [dbo].[RapChieu] ([IDCumRap], [TenRap], [DiaChiRap], [SoPhong], [SoGhe], [Facebook]) VALUES (N'CR01', N'CGV', N'Bà Triệu', 11, 200, N'CGV Cinema')
INSERT [dbo].[RapChieu] ([IDCumRap], [TenRap], [DiaChiRap], [SoPhong], [SoGhe], [Facebook]) VALUES (N'CR02', N'Lotte', N'Landmark', 8, 200, N'Lotte Cinema')
INSERT [dbo].[RapChieu] ([IDCumRap], [TenRap], [DiaChiRap], [SoPhong], [SoGhe], [Facebook]) VALUES (N'CR03', N'BHD Star', N'Cầu Giấy', 8, 200, N'BHD Cinema')
INSERT [dbo].[RapChieu] ([IDCumRap], [TenRap], [DiaChiRap], [SoPhong], [SoGhe], [Facebook]) VALUES (N'CR04', N'Beta', N'Mỹ Đình', 10, 200, N'Beta Cinema')
INSERT [dbo].[RapChieu] ([IDCumRap], [TenRap], [DiaChiRap], [SoPhong], [SoGhe], [Facebook]) VALUES (N'CR05', N'Quốc Gia', N'Thái Hà', 10, 200, N'QG Cinema')
INSERT [dbo].[TaiKhoan] ([IDTK], [MatKhau], [HoTen]) VALUES (N'ID01', N'123456', N'Huyen Trang')
INSERT [dbo].[TaiKhoan] ([IDTK], [MatKhau], [HoTen]) VALUES (N'ID02', N'123456', N'Thai Son')
INSERT [dbo].[TaiKhoan] ([IDTK], [MatKhau], [HoTen]) VALUES (N'ID03', N'123456', N'Phuoc Dat')
INSERT [dbo].[TaiKhoan] ([IDTK], [MatKhau], [HoTen]) VALUES (N'ID04', N'123456', N'Duc Anh')
INSERT [dbo].[TaiKhoan] ([IDTK], [MatKhau], [HoTen]) VALUES (N'ID05', N'123456', N'Duc Son')
INSERT [dbo].[Ve] ([IDPhim], [IDLichChieu], [IDVe], [ViTri], [NgayChieu], [GioChieu]) VALUES (N'MP01', N'LC03', N'MV01', N'D1', N'20/05/2020', N'8:00')
INSERT [dbo].[Ve] ([IDPhim], [IDLichChieu], [IDVe], [ViTri], [NgayChieu], [GioChieu]) VALUES (N'MP01', N'LC01', N'MV02', N'D2', N'20/05/2020', N'8:00')
ALTER TABLE [dbo].[HoaDon]  WITH CHECK ADD  CONSTRAINT [FK3] FOREIGN KEY([IDTK])
REFERENCES [dbo].[TaiKhoan] ([IDTK])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[HoaDon] CHECK CONSTRAINT [FK3]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK6] FOREIGN KEY([IDHoaDon])
REFERENCES [dbo].[HoaDon] ([IDHoaDon])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK6]
GO
ALTER TABLE [dbo].[HoaDonChiTiet]  WITH CHECK ADD  CONSTRAINT [FK7] FOREIGN KEY([IDVe])
REFERENCES [dbo].[Ve] ([IDVe])
GO
ALTER TABLE [dbo].[HoaDonChiTiet] CHECK CONSTRAINT [FK7]
GO
ALTER TABLE [dbo].[LichChieu]  WITH CHECK ADD  CONSTRAINT [FK2] FOREIGN KEY([IDPhim])
REFERENCES [dbo].[Phim] ([IDPhim])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[LichChieu] CHECK CONSTRAINT [FK2]
GO
ALTER TABLE [dbo].[Phim]  WITH CHECK ADD  CONSTRAINT [FK1] FOREIGN KEY([IDCumRap])
REFERENCES [dbo].[RapChieu] ([IDCumRap])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Phim] CHECK CONSTRAINT [FK1]
GO
ALTER TABLE [dbo].[Ve]  WITH CHECK ADD  CONSTRAINT [FK4] FOREIGN KEY([IDPhim])
REFERENCES [dbo].[Phim] ([IDPhim])
ON UPDATE CASCADE
ON DELETE CASCADE
GO
ALTER TABLE [dbo].[Ve] CHECK CONSTRAINT [FK4]
GO
ALTER TABLE [dbo].[Ve]  WITH CHECK ADD  CONSTRAINT [FK5] FOREIGN KEY([IDLichChieu])
REFERENCES [dbo].[LichChieu] ([IDLichChieu])
GO
ALTER TABLE [dbo].[Ve] CHECK CONSTRAINT [FK5]
GO
USE [master]
GO
ALTER DATABASE [QLRPhim] SET  READ_WRITE 
GO
