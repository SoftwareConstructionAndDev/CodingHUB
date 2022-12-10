-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 08, 2022 at 09:25 PM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 8.1.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `hamdan`
--

-- --------------------------------------------------------

--
-- Table structure for table `pg`
--

CREATE TABLE `pg` (
  `id` int(255) NOT NULL,
  `Title` varchar(1000) NOT NULL,
  `Author` varchar(1000) NOT NULL,
  `XML PG` mediumtext NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `pg`
--

INSERT INTO `pg` (`id`, `Title`, `Author`, `XML PG`) VALUES
(1, 'بنگلہ دیش کی عدالت کا تاریخی فیصلہ', 'سید منظور الحسن', 'بنگلہ دیش کی عدالتِ عالیہ نے طلاق کے ایک مقدمے کا فیصلہ کرتے ہوئے علما کے فتووں کو غیر قانونی قرار دیا ہے۔ عدالت نے پارلیمنٹ سے یہ درخواست کی ہے کہ وہ جلد ایسا قانون وضع کرے کہ جس کے بعد فتویٰ بازی قابلِ دست اندازیِ پولیس جرم بن جائے۔ بنگلہ دیش کے علما نے اس فیصلے پر بھر پور ردِ عمل ظاہرکرتے ہوئے اس کے خلاف ملک گیر تحریک چلانے کا اعلان کیا ہے۔ اس ضمن میں علما کی ایک تنظیم ”اسلامک یونٹی الائنس“ نے متعلقہ ججوں کو مرتد یعنی دین سے منحرف اور دائرۂ اسلام سے خارج قرار دیا ہے۔ فتوے کا لفظ دو موقعوں پر استعمال ہوتا ہے۔ ایک اس موقع پر جب کوئی صاحبِ علم شریعت کے کسی مئلے کے بارے میں اپنی رائے پیش کرتا ہے۔ دوسرے اس موقع پر جب کوئی عالمِ دین کسی خاص واقعے کے حوالے سے اپنا قانونی فیصلہ صادر کرتا ہے۔ ایک عرصے سے ہمارے علما کے ہاں اس دوسرے موقعِ استعمال کا غلبہ ہو گیا ہے۔ اس کا نتیجہ یہ نکلا ہے کہ اس لفظ کا رائے یا نقطۂ نظر کے مفہوم میں استعمال کم و بیش متروک ہو گیا ہے۔ چنانچہ اب فتوے کا مطلب ہی علما کی طرف سے کسی خاص مألے یا واقعے کے بارے میں حتمی فیصلے کا صدور سمجھا جاتا ہے۔ علما اسی حیثیت سے فتویٰ دیتے ہیں اور عوام الناس اسی اعتبار سے اسے قبول کرتے ہیں۔ اس صورتِ حال میں ہمارے نزدیک، چند مسائل پیدا ہوتے ہیں۔ اس سے پہلے کہ ہم مذکورہ فیصلے کے بارے میں اپنا تاثر بیان کریں، یہ ضروری معلوم ہوتا ہے کہ مختصر طور پر ان مسائل کا جائزہ لے لیا جائے۔ پہلا مألہ یہ پیدا ہوتا ہے کہ قانون سازی اور شرعی فیصلوں کا اختیار ایسے لوگوں کے ہاتھ میں آجاتا ہے جو قانون کی رو سے اس کے مجاز ہی نہیں ہوتے۔ کسی میاں بیوی کے مابین طلاق کے مألے میں کیا طلاق واقع ہوئی ہے یا نہیں ہوئی؟ ان کا نکاح قائم ہے یا باطل ہو گیا ہے؟ رمضان یا عید کا چاند نظر آیا ہے یا نہیں آیا؟کوئی مسلمان اپنے کسی قول یا اقدام کی وجہ سے کہیں دائرۂ اسلام سے خارج اورنتیجۃً مسلم شہریت کے قانونی حقوق سے محروم تو نہیں ہو گیا؟ یہ اور اس نوعیت کے بہت سے دوسرے معاملات سر تا سر قانون اور عدالت سے متعلق ہوتے ہیں۔ علما کی فتویٰ سازی کے نتیجے میں یہ امور گویا حکومت اورعدلیہ کے ہاتھ سے نکل کر غیر متعلق افراد کے ہاتھوں میں آجاتے ہیں۔ دوسرا مألہ یہ پیدا ہوتا ہے کہ قانون کی حاکمیت کا تصور مجروح ہوتا ہے اور لوگوں میں قانون سے روگردانی کے رجحانات کو تقویت ملتی ہے۔ اس کی وجہ یہ ہے کہ قانون اپنی روح میں نفاذ کا متقاضی ہوتا ہے۔ اگر اسے نفاذ سے محروم رکھا جائے تو اس کی حیثیت محض رائے اور نقطۂ نظر کی سی ہوتی ہے۔ غیر مجاز فرد سے صادر ہونے والا فتویٰ یا قانون حکومت کی قوتِ نافذہ سے محروم ہوتا ہے۔ اس کی خلاف ورزی پر کسی قسم کی سزا کا خوف نہیں ہوتا۔ چنانچہ فتویٰ اگر مخاطب کی پسند کے مطابق نہ ہو تو اکثر وہ اسے ماننے سے انکار کر دیتا ہے۔ اس طرح وہ فتویٰ یا قانون بے توقیر ہوتا ہے۔ ایسے ماحول میں رہنے والے شہریوں میں قانون ناپسندی کا رجحان فروغ پاتا ہے اور جیسے ہی انھیں موقع ملتا ہے وہ بے دریغ قانون کی خلاف ورزی کر ڈالتے ہیں۔ تیسرامسئلہ یہ پیدا ہوتا ہے کہ اگرغیر مجاز افراد سے صادر ہونے والے فیصلوں کو نافذ کرنے کی کوشش کی جائے تو ملک میں بد نظمی اور انارکی کا شدید اندیشہ پیدا ہو جاتا ہے۔ جب غیر مجازافراد سے صادر ہونے والے قانونی فیصلوں کو حکومتی سرپرستی کے بغیر نافذ کرنے کی کوشش کی جاتی ہے تو اپنے عمل سے یہ اس بات کا اعلان ہوتا ہے کہ مرجعِ قانون و اقتدارتبدیل ہو چکا ہے۔ جب کوئی عالمِ دین مثال کے طور پر، یہ فتویٰ صادر کرتا ہے کہ سینما گھروں اور ٹی وی اسٹیشنوں کو مسمار کرنامسلمانوں کی ذمہ داری ہے، یا کسی خاص قوم کے خلاف جہاد فرض ہو چکا ہے، یا فلاں کی دی گئی طلاق واقع ہو گئی ہے اور فلاں کی نہیں ہوئی، یا فلاں شخص یا گروہ اپنا اسلامی تشخص کھو بیٹھا ہے تو وہ درحقیقت قانونی فیصلہ جاری کر رہا ہوتا ہے۔ دوسرے الفاظ میں، وہ ریاست کے اندر اپنی ایک الگ ریاست بنانے کا اعلان کر رہا ہوتا ہے۔ اس کا نتیجہ سوائے انتشار اور انارکی کے اور کچھ نہیں نکلتا۔ یہی وجہ ہے کہ جن علاقوں میں حکومت کی گرفت کمزور ہوتی ہے وہاں اس طرح کے فیصلوں کا نفاذ بھی ہو جاتا ہے اور حکومت منہ دیکھتی رہتی ہے۔ چوتھا مسئلہ یہ پیدا ہوتا ہے کہ مختلف مذہبی مسالک کی وجہ سے ایک ہی معاملے میں مختلف اور متضاد فتوے منظرِ عام پر آتے ہیں۔ یہ تو ہمارے روز مرہ کی بات ہے کہ ایک ہی گروہ کو بعض علماے دین کافر قرار دیتے ہیں اور بعض مسلمان سمجھتے ہیں۔ کسی شخص کے منہ سے اگر ایک موقع پر طلاق کے الفاظ تین بار نکلتے ہیں تو بعض علما اس پر ایک طلاق کا حکم لگا کر رجوع کا حق باقی رکھتے ہیں اور بعض تین قرار دے کررجوع کو باطل قرار دیتے ہیں۔ یہ صورتِ حال ایک عام آدمی کے لیے نہایت دشواریاں پیدا کر دیتی ہے۔ پانچواں مسئلہ یہ پیدا ہوتا ہے کہ حکمران اگر دین و شریعت سے کچھ خاص دلچسپی نہ رکھتے ہوں تو وہ اس صورتِ حال میں شریعت کی روشنی میں قانون سازی کی طرف متوجہ نہیں ہوتے۔ کام چل رہا ہے کے اصول پر وہ اس طریقِ قانون سازی سے سمجھوتاکیے رہتے ہیں۔ اس کا نتیجہ یہ نکلتا ہے کہ حکومتی ادارے ضروری قانون سازی کے بارے میں بے پروائی کا رویہ اختیار کرتے ہیں اور قوانین اپنے فطری ارتقا سے محروم رہتے ہیں۔ چھٹا مألہ یہ پیدا ہوتا ہے کہ رائج الوقت قانون اور عدالتوں کی توہین کے امکانات پیدا ہو جاتے ہیں۔ جب کسی مسئلے میں عدالتیں اپنا فیصلہ سنائیں اور علما اسے باطل قرار دیتے ہوئے اس کے برعکس اپنا فیصلہ صادر کریں تو اس سے عدالتوں کا وقار مجروح ہوتا ہے۔ اس کا مطلب یہ ہوتا ہے کہ کوئی شہری عدلیہ کو چیلنج کرنے کے لیے کھڑا ہو گیا ہے۔ ان مسائل کے تناظر میں بنگلہ دیش کی عدالتِ عالیہ کا فیصلہ ہمارے نزدیک، امت کی تاریخ میں ایک عظیم فیصلہ ہے۔ جناب جاوید احمد صاحب غامدی نے اسے بجا طور پر صدی کا بہترین فیصلہ قرار دیا ہے۔ بنگلہ دیش کی عدالت اگر علما کے فتووں اور قانونی فیصلوں پر پابندی لگانے کے بجائے، ان کے اظہارِ رائے پر پابندی عائدکرتی تو ہم اسے صدی کا بدترین فیصلہ قرار دیتے اور انھی صفحات میں بے خوفِ لومۃ و لائم اس پر نقد کر رہے ہوتے۔ موجودہ زمانے میں امتِ مسلمہ کا ایک بڑا المیہ یہ ہے کہ اس کے علما اپنی اصل ذمہ داری کو ادا کرنے کے بجائے ان ذمہ داریوں کو ادا کرنے پر مصر ہیں جن کے نہ وہ مکلف ہیں اور نہ اہل ہیں۔ قرآن و سنت کی رو سے علما کی اصل ذمہ داری دعوت و تبلیغ، انذار و تبشیر اور تعلیم و تحقیق ہے۔ ان کا کام سیاست نہیں، بلکہ سیاست دانوں کو دین کی رہنمائی سے آگاہی ہے ؛ ان کا کام حکومت نہیں، بلکہ حکمرانوں کی اصلاح کی کوشش ہے؛ ان کا کام جہاد و قتال نہیں، بلکہ جہادکی تعلیم اور جذبۂ جہاد کی بیداری ہے؛ اسی طرح ان کا کا م قانون سازی اور فتویٰ بازی نہیں بلکہ تحقیق و اجتہاد ہے۔ گویا انھیں قرآنِ مجیدکامفہوم سمجھنے، سنتِ ثابتہ کا مدعا متعین کرنے اور قولِ پیغمبر کا منشامعلوم کرنے کے لیے تحقیق کرنی ہے اور جن امور میں قرآن و سنت خاموش ہیں ان میں اپنی عقل و بصیرت سے اجتہادی آراقائم کرنی ہیں۔ ان کی کسی تحقیق یا اجتہاد کو جب عدلیہ یا پارلیمنٹ قبول کرے گی تو وہ قانون قرار پائے گا۔ اس سے پہلے اس کی حیثیت محض ایک رائے کی ہوگی۔ اس لیے اسے اسی حیثیت سے پیش کیا جائے گا۔ اس کا مطلب یہ ہے کہ کوئی حکم نہیں لگایا جائے گا، کوئی فیصلہ نہیں سنایا جائے گا، کوئی فتویٰ نہیں دیا جائے گا، بلکہ طالبِ علمانہ لب و لہجے میں محض علم و استدلال کی بنا پر اپنا نقطۂ نظر پیش کیا جائے گا۔ یہ نہیں کہا جائے گا کہ فلاں شخص کافر ہے، بلکہ اس کی اگر ضرورت پیش آئے تو یہ کہا جائے گا کہ فلاں شخص کا فلاں عقیدہ کفر ہے۔ یہ نہیں کہا جائے گا کہ فلاں آدمی دائرۂ اسلام سے خارج ہو گیا ہے، بلکہ یہ کہا جائے گا کہ فلاں آدمی کا فلاں نقطۂ نظر اسلام کے دائرے میں نہیں آتا۔ یہ نہیں کہا جائے گا فلاں آدمی مشرک ہے، بلکہ یہ کہا جائے گا فلاں نظریہ یا فلاں طرزِ عمل شرک ہے۔ یہ نہیں کہا جائے گا کہ زید کی طرف سے دی گئی ایک وقت کی تین طلاقیں واقع ہو گئی ہیں، بلکہ یہ کہا جائے گا کہ ایک وقت کی تین طلاقیں واقع ہو نی چاہییں۔ حکم لگانا، فیصلہ سنانا، قانون وضع کرنا اورفتویٰ جاری کرنا درحقیقت، عدلیہ اور حکومت کا کام ہے کسی عالمِ دین یا کسی اور غیر مجاز فرد کی طرف سے اس کام کو انجام دینے کی کوشش سراسر تجاوز ہے۔ خلافتِ راشدہ کے زمانے میں اس اصول کو ہمیشہ ملحوظ رکھا گیا۔ شاہ ولی اللہ محدث دہلوی اپنی کتاب ”ازالتہ الخفا ء“ میں لکھتے ہیں: ”اس زمانے تک وعظ اور فتویٰ خلیفہ کی رائے پر موقوف تھا۔ خلیفہ کے حکم کے بغیر نہ وعظ کہتے تھے اور نہ فتویٰ دیتے تھے۔ بعد میں خلیفہ کے حکم کے بغیر وعظ کہنے اور فتویٰ دینے لگے اور فتویٰ کے معاملے میں جماعت (مجلسِ شوریٰ) کے مشورہ کی جو صورت پہلے تھی وہ باقی نہ رہی——- (اس زمانے میں) جب کوئی اختلافی صورت نمودار ہوتی، خلیفہ کے سامنے معاملہ پیش کرتے، خلیفہ اہلِ علم و تقویٰ سے مشورہ کرنے کے بعد ایک رائے قائم کرتا اور وہی سب لوگوں کی رائے بن جاتی۔ حضرت عثمان کی شہادت کے بعد ہر عالم بطورِ خود فتویٰ دینے لگا اور اس طرح مسلمانوں میں اختلاف برپا ہوا۔“ (بحوالہ ”اسلامی ریاست میں فقہی اختلافات کا حل“، مولاناامین احسن اصلاحی، ص۳۲)'),
(2, 'معاشرہ کی اصلاح کے وسائل', 'امام امین احسن اصلاحی', 'اصلاح معاشرہ کے جن پہلوؤں کی طرف ہم نے توجہ دلائی ہے، بہت سے درد مندوں نے ان کی اہمیت محسوس کی ہے۔ اس اثنا میں ہمیں جو خطوط موصول ہوئے ہیں، ان سے اندازہ ہوتا ہے کہ ایسے لوگ بحمد اللہ ہمارے اندر موجود ہیں جو صورت حال کی نزاکت کا احساس رکھتے ہیں اور دین کے بقا و تحفظ کے لیے وہ اپنا وقت بھی صرف کرنے کے لیے تیار ہیں اور ان میں سے جن کو خدا نے مال دیا ہے، وہ اپنا مال بھی خرچ کرنے کے لیے آمادہ ہیں۔ ان خطوط سے ہمیں بڑی تقویت حاصل ہوئی ہے۔ ہماری دعا ہے کہ اللہ تعالیٰ ایسے درد مندوں کی تعداد میں اضافہ فرمائے۔ کسی معاشرہ کے اندر ہزار خرابیاں موجود ہوں، لیکن جب تک اس کے اندر ان خرابیوں کو محسوس کرنے والے اور ان کو دور کرنے کی راہ میں ایثار کرنے والے افراد موجود رہیں، اس وقت تک اس کے مستقبل کی طرف سے مایوس ہونے کی کوئی وجہ نہیں ہے۔ کسی معاشرہ کی حالت مایوس کن اس وقت ہوتی ہے، جب اس کا بگاڑ اس حد کو پہنچ جائے کہ نہ اس کی اصلاح کے لیے اپنا وقت اور مال قربان کرنے والے باقی رہ جائیں اور نہ اس کی حالت پر غم کھانے والے۔ الحمد للہ ہمارا بگاڑ ابھی اس حد کو نہیں پہنچا ہے۔ لیکن ان خطوط سے جہاں ہمیں یہ اندازہ کر کے خوشی ہوئی ہے کہ ہمارے اندر ایسے لوگ موجود ہیں جو اپنے وسائل و ذرائع اسلام کے لیے استعمال کرنے پر آمادہ ہیں۔ وہیں انھی خطوط سے ہمیں یہ اندازہ بھی ہوا ہے کہ ابھی اس معاملہ کے بعض گوشے لوگوں کے سامنے اچھی طرح واضح نہیں ہیں۔ ہمارا خیال یہ ہے کہ جب تک یہ گوشے اچھی طرح واضح نہیں ہوں گے، اس وقت تک یہ احساس، جس کی طرف ہم نے اشارہ کیا ہے، کوئی مفید نتیجہ نہیں پیدا کر سکتا۔ اس وجہ سے یہ ضروری معلوم ہوتا ہے کہ ہم ان پہلوؤں کی طرف بھی چند سطروں میں توجہ دلا دیں۔ اس وقت جو لوگ اس مقصد کے لیے اپنے مال یا وقت کی کوئی قربانی دینا چاہتے ہیں، انھیں دو باتوں پر اچھی طرح غور کر کے اپنے ذہن کو یک سو کر لینا چاہیے۔ ایک اس بات پر کہ اس وقت اسلام کے لیے جو مرحلہ درپیش ہے، اس مرحلہ میں اسلام کی خدمت کے لیے سب سے مقدم اور سب سے زیادہ ضروری کام کیا ہے؟ دوسرے اس بات پر کہ اس وقت جو وسائل و ذرائع میسر ہیں، ان کو اس مقدم اور ضروری کام کے لیے زیادہ سے زیادہ بہتر طریقہ پر کس طرح استعمال کیا جا سکتا ہے؟ ان دونوں سوالوں پر غور کیے اور ان کے باب میں یک سو ہوئے بغیر جو کام اس وقت کیے جائیں گے، ہمیں اندیشہ ہے کہ ان پر ہماری مادی و ذہنی طاقتیں تو صرف ہوں گی، لیکن ان سے کوئی فائدہ نہیں ہو گا اور ہو گا تو اتنا کم کہ وہ نہ ہونے کے برابر ہو گا۔ پہلے سوال پر غور کرنے کی ضرورت اس وجہ سے ہے کہ یہ بات تو بہت سے لوگ جانتے ہیں کہ ہمارا معاشرہ بیمار ہے، لیکن اس امر میں بڑا اختلاف ہے کہ یہ بیماری کیا ہے اور اس کا علاج کیا ہے؟ اس بیماری اور اس کے علاج کے متعین نہ ہونے کے سبب سے ہر تیماردار الگ الگ مرض تشخیص کر رہا ہے اور الگ الگ اس کے علاج تجویز کر رہا ہے۔ بعض لوگ اس کے ہاتھ پاؤں کو مریض سمجھ رہے ہیں اورا پنی اس تشخیص کے مطابق اس کے پاؤں پر مالش کرنا چاہتے ہیں۔ بعض اس کے پیٹ میں درد خیال کر رہے ہیں اور اپنی سمجھ کے مطابق اس درد کی تسکین کی کوئی دوا دینا چاہتے ہیں۔ بعض اس کو ضعف قلب کا مریض سمجھتے ہیں، وہ اس ضعف قلب کو دور کرنے کے لیے کوئی مقوی قلب چیز اس کو کھلانا چاہتے ہیں۔ غرض جتنے تیماردار ہیں، اتنی ہی تشخیصیں اور اتنے ہی علاج ہیں۔ یہ اختلاف تشخیص و اختلاف علاج اگرچہ زیادہ تر نتیجہ ہے اس ذہنی پریشانی کا جس سے ایک ہمہ گیر خرابی کے احساس نے ہمیں دوچار کر دیا ہے اور اس پہلو سے یہ ایک قدرتی سی چیز ہے، لیکن کسی موثر اور نتیجہ خیز علاج کے لیے اس پریشان خیالی کا دور ہونا ضروری ہے۔ جب کسی گھر میں آگ لگتی ہے تو بالعموم یہی ہوتا ہے کہ جس جس کونے سے بھی دھواں اٹھتا نظر آتا ہے، پاس پڑوس کے ہمدرد اسی کونے کو آگ کا مرکز سمجھ کر اس پر اپنے اپنے پانی کے ڈول پھینکنے شروع کر دیتے ہیں۔ یہ کام اگرچہ وہ ازراہ ہمدردی کرتے ہیں، لیکن منتشر کوششوں سے آگ نہیں بجھا کرتی۔ آگ بجھتی اس وقت ہے جب فائر بریگیڈ آگ کے اصل سنٹر کو متعین کر کے اس کو اپنے محاصرے میں لے لیتا ہے اور اپنے زور دار دونگڑوں سے اس کے سر غرور کو کچل کے رکھ دیتا ہے۔ دوسرے سوال پر غور کرنے کی ضرورت یوں ہے کہ اس مقصد کے لیے جو اسباب و وسائل اس وقت میسر ہیں یا آئندہ جن کے میسر آنے کی توقع ہے، وہ بہرحال نہایت محدود بھی ہیں اور نہایت منتشر حالت میں بھی ہیں۔ اگر یہ اسباب و وسائل الگ الگ مختلف مقامات پر استعمال ہوں تو کہیں بھی ان سے کوئی بڑے پیمانہ کا کوئی ایسا نتیجہ خیز کام نہیں انجام پا سکتا جو اس ضرورت کو پورا کر سکے جس کو پورا کرنا پیش نظر ہے۔ پھر مادی وسائل سے زیادہ اہم سوال اس مقصد کے لیے ذی صلاحیت اور موزوں اشخاص کی فراہمی ہے۔ اس زمانہ میں کسی اس طرح کے کام کے لیے سرمایہ حاصل کرنا جتنا مشکل ہے، اس سے کہیں زیادہ مشکل اس کے لیے اس دور قحط الرجال میں آدمیوں کی تلاش ہے۔ ان دونوں سوالوں میں سے جہاں تک پہلے سوال کا تعلق ہے، اس پر ہم نے جس حد تک غور کیا ہے ہم اسی نتیجہ پر پہنچے ہیں کہ ہماری بیماری کوئی سرسری اور معمولی قسم کی نہیں ہے، بلکہ بڑی گہری ہے۔ انگریزوں کے تسلط کے بعد سے مغربی فکر و فلسفہ کی جو چھوت ہمیں لگی، اس نے ڈیڑھ دو سو سال کی مدت میں ایک مزمن بیماری کی شکل اختیار کر لی ہے اور اب اس نے ہمارے ذہین طبقہ کے دماغ اور دل بالکل ماؤف کر دیے ہیں۔ اس بیماری کا عمل تقریباً یک طرفہ قسم کا رہا ہے۔ اس کے تدارک کی تدبیریں یا تو اختیار ہی نہیں کی گئیں یا اختیار کی گئیں تو وہ اتنی سائنٹیفک اور علمی نہیں تھیں جتنا سائنٹیفک اور علمی اس کا عمل تھا، اس وجہ سے آہستہ آہستہ اس کے اثرات دماغوں اور دلوں کے اندر اتنے گہرے اتر چکے ہیں کہ اب اس حقیقت کا اعتراف کرنا پڑتا ہے کہ ان سے ہمارے ذہین طبقہ کی اکثریت کے عقائد و ایمانیات کی جڑیں تک ہل چکی ہیں۔ ظاہر ہے کہ کسی قوم کے ذہین طبقہ کی بیماری اعضا و جوارح کی بیماری نہیں ہے، بلکہ اس کے دماغ اور عقل کی بیماری ہے اور دماغ کی خرابی ہر شخص سمجھ سکتا ہے کہ ایک ایسی بیماری ہے جس کا علاج نہ تو درد سر کی دوا سے ہو سکتا ہے اور نہ ہر عطائی اس کا علاج کر سکتا ہے۔ یہ مغرب کی فاسد عقلیت کا ایک عذاب ہے جو ہم پر مسلط ہوا ہے۔ اس فاسد عقلیت کا مداوا اگر ہو سکتا ہے تو اس صالح عقلیت ہی سے ہو سکتا ہے جو قرآن اور سنت کی حکمت کے اندر مضمر ہے۔ ظاہر ہے کہ یہ کام ہر شخص کے بس کا نہیں ہے۔ یہ کام وہی لوگ کر سکتے ہیں جو دین کی عقلیت کے بھی رازداں ہوں اور جو موجودہ عقلیت کے مفاسد سے بھی اچھی طرح واقف ہوں اور ساتھ ہی اس معیار و پیمانہ پر اور اس انداز اور اس طریقہ سے اس کام کو کر سکنے کا سلیقہ رکھتے ہوں جو موجودہ زمانہ میں اس طرح کے کام کے لیے وجود میں آ چکا ہے۔ یہ ایک ٹھوس علمی اور تحقیقی کام ہے جس کا فائدہ صرف اسی صورت میں حاصل ہو سکنے کی توقع ہے جب ایک ٹیم پرسکون ماحول اور اطمینان بخش حالات کے اندر اس خدمت کے لیے اپنے آپ کو دوسری تمام دل چسپیوں اور ہنگامی مشاغل سے فارغ کر لے اور اپنی محنتوں سے ان تمام زہروں کے تریاق بھی فراہم کرے جن سے اس وقت ہمارے معاشرے کا ذہین طبقہ مسموم ہے اور ساتھ ہی ان لوگوں کی تربیت بھی کرے، جو آئندہ نسلوں کے لیے اس خدمت کو جاری رکھ سکیں۔ دوسرے سوال سے متعلق ہمارا مشورہ اسلام اور مسلمانوں کے ان تمام بہی خواہوں کے لیے جو اس عظیم خدمت میں اپنے وسائل و ذرائع سے حصہ لینا چاہتے ہیں یہ ہے کہ وہ اسلام کے وسیع مفاد کے پیش نظر اپنے شخصی اور مقامی میلانات و رجحانات کو اس وقت بھول جائیں۔ پیش نظر کام ایک بڑا وسیع کام ہے، اس کو صحیح طور پر انجام دینے کے لیے وسیع اسباب و وسائل کی ضرورت ہے جن کے فراہم ہونے کی توقع صرف اسی شکل میں ہو سکتی ہے جب تمام اصحاب وسائل مل کر اپنی متحدہ کوشش سے فراہم کریں۔ متحدہ کوشش کی صورت میں تو بلاشبہ اس بات کی توقع ہے کہ اس کام کے لیے ضرورت کے مطابق سرمایہ بھی حاصل ہو جائے اور اس کا بھی امکان ہے کہ اس کام کو چلانے کے لیے موزوں اشخاص بھی مل جائیں۔ لیکن اگر وسائل رکھنے والے حضرات کسی ایک اسکیم پر متفق نہ ہو سکے تو اس صورت میں کسی بڑے کام کے انجام پا سکنے کی کوئی توقع نہیں ہے۔ زیادہ سے زیادہ بس یہ ہو سکے گا کہ بعض لوگ اپنے اپنے شہروں میں ایک آدھ بے مقصد قسم کے مدرسے اور قائم کر دیں گے یا اپنے دیہاتوں میں وعظ کہنے کے لیے ایک آدھ مبلغ بھیج دیں گے۔ اس سے ان مدرسوں کے بانیوں اور ان مبلغوں کے سرپرستوں کو تو ضرور تسلی ہو جائے گی کہ انھوں نے دین کی کوئی خدمت انجام دی ہے، لیکن ان مدرسوں اور ان مبلغوں سے اس اسلام کا کیا بھلا ہو گا جس کی بنیادیں تک ہمارے معاشرے کے اندر ہل چکی ہیں۔ اس کام کے ساتھ ساتھ یہ بھی ضروری ہے کہ اپنے عام معاشرہ کی دینی و اخلاقی اصلاح کی جدوجہد بھی شروع کی جائے۔ اس کا زوال و انحطاط اب خطرہ کے پوائنٹ تک پہنچ چکا ہے۔ اب اس کام میں مزید غفلت کے معنی اس کو اسلامی نقطۂ نظر سے موت کے حوالہ کر دینے کے ہوں گے۔ ابھی تو اس بات کا امکان ہے کہ اگر سمجھ دار بے لوث اور مخلص لوگوں کی ایک جماعت اس کی اصلاح کے لیے اٹھ کھڑی ہو تو شاید اللہ تعالیٰ اس کی کوششوں سے اس کی حالت کو سنبھال دے، لیکن اگر یہ کوشش نہ کی گئی تو زیادہ عرصہ نہیں گزرے گا کہ اس کے لیے گمراہی کا ہر موڑ مڑ جانا بالکل متوقع ہو گا اور عند اللہ اس کی ذمہ داری ان لوگوں پر ہو گی جو اس کی اصلاح کے سلسلہ میں کچھ کر سکنے کی صلاحیت رکھتے تھے، لیکن انھوں نے کچھ نہیں کیا۔ جن لوگوں کے نزدیک سیاسی اقتدار کے حصول کے بغیر اصلاح معاشرہ کی کوئی جدوجہد ممکن ہی نہیں ہے، انھیں ہم ان کے نظریے کی بنا پر مجبور سمجھتے ہیں، لیکن جو لوگ سیاست سے الگ رہ کر بھی اسلام کی خدمت کر سکنے کے امکانات کے قائل ہیں، ہم انھیں ان کی ذمہ داری یاد دلانا چاہتے ہیں۔');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `pg`
--
ALTER TABLE `pg`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pg`
--
ALTER TABLE `pg`
  MODIFY `id` int(255) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
