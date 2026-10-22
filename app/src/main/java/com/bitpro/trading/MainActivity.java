
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html>
<html b:version='2'
      class='v2'
      expr:dir='data:blog.languageDirection'
      xmlns='http://www.w3.org/1999/xhtml'
      xmlns:b='http://www.google.com/2005/gml/b'
      xmlns:data='http://www.google.com/2005/gml/data'
      xmlns:expr='http://www.google.com/2005/gml/expr'>

<head>
  <meta charset='UTF-8'/>
  <meta content='width=device-width, initial-scale=1' name='viewport'/>
  <meta content='শীতের সকাল — খেজুরের রস ও খাঁটি গুড়' name='description'/>
  <title>শীতের সকাল | খেজুরের রস ও গুড়</title>

  <link href='https://fonts.googleapis.com' rel='preconnect'/>
  <link href='https://fonts.gstatic.com' rel='preconnect' crossorigin='anonymous'/>
  <link href='https://fonts.googleapis.com/css2?family=Hind+Siliguri:wght@400;500;600;700&amp;display=swap' rel='stylesheet'/>

  <b:include data='blog' name='all-head-content'/>

  <b:skin><![CDATA[
    * { box-sizing: border-box; }

    :root {
      --green: #228B45;
      --dark: #155d30;
      --cream: #fffaf0;
      --light: #edf7ec;
      --brown: #98552b;
    }

    html { scroll-behavior: smooth; }

    body {
      margin: 0;
      background: var(--cream);
      color: #263b2b;
      font-family: 'Hind Siliguri', sans-serif;
      line-height: 1.65;
    }

    a { text-decoration: none; color: inherit; }

    button, input, select, textarea {
      font-family: 'Hind Siliguri', sans-serif;
      font-size: 16px;
    }

    button { cursor: pointer; }

    .announcement {
      padding: 7px;
      background: var(--dark);
      color: white;
      text-align: center;
    }

    .header {
      position: sticky;
      top: 0;
      z-index: 20;
      background: white;
      border-bottom: 1px solid #e5e8dc;
    }

    .header-inner {
      max-width: 1180px;
      margin: auto;
      padding: 12px 18px;
      display: flex;
      align-items: center;
      justify-content: space-between;
      flex-wrap: wrap;
      gap: 12px;
    }

    .logo {
      color: var(--green);
      font-size: 27px;
      font-weight: 700;
    }

    .nav {
      display: flex;
      flex-wrap: wrap;
      align-items: center;
      gap: 15px;
    }

    .nav a:hover { color: var(--green); }

    .cart-nav, .btn {
      display: inline-block;
      border: 0;
      border-radius: 8px;
      background: var(--green);
      color: white !important;
      padding: 10px 18px;
      font-weight: 600;
      text-align: center;
    }

    .cart-nav { padding: 7px 12px; }

    .hero {
      min-height: 410px;
      display: flex;
      align-items: center;
      color: white;
      background:
        linear-gradient(90deg, rgba(12,48,23,.78), rgba(12,48,23,.22)),
        url('https://images.unsplash.com/photo-1470252649378-9c29740c9fa8?auto=format&amp;fit=crop&amp;w=1600&amp;q=80') center/cover;
    }

    .hero-inner {
      max-width: 1180px;
      width: 100%;
      margin: auto;
      padding: 55px 22px;
    }

    .hero h1 {
      max-width: 680px;
      margin: 0 0 14px;
      font-size: clamp(32px, 5vw, 52px);
      line-height: 1.3;
    }

    .hero p {
      max-width: 620px;
      font-size: 18px;
      margin: 0 0 23px;
    }

    .button-row { display: flex; flex-wrap: wrap; gap: 12px; }

    .btn-light { background: white; color: var(--dark) !important; }

    .section {
      max-width: 1180px;
      margin: auto;
      padding: 45px 18px;
    }

    .section-heading {
      text-align: center;
      margin-bottom: 28px;
    }

    .section-heading h2 {
      margin: 0 0 8px;
      color: var(--dark);
      font-size: 30px;
    }

    .section-heading p { margin: 0; color: #647063; }

    .products {
      display: grid;
      grid-template-columns: repeat(4, minmax(0, 1fr));
      gap: 18px;
    }

    .product-card {
      display: flex;
      flex-direction: column;
      overflow: hidden;
      border: 1px solid #e5e8dc;
      border-radius: 12px;
      background: white;
      box-shadow: 0 4px 15px rgba(25,65,30,.06);
    }

    .product-card img {
      display: block;
      width: 100%;
      aspect-ratio: 4 / 3;
      object-fit: cover;
    }

    .product-content {
      display: flex;
      flex: 1;
      flex-direction: column;
      padding: 14px;
    }

    .product-content h3 {
      margin: 0 0 6px;
      color: var(--dark);
      font-size: 20px;
      line-height: 1.4;
    }

    .product-description {
      flex: 1;
      color: #697366;
      font-size: 14px;
    }

    .product-price {
      margin: 7px 0 12px;
      color: var(--brown);
      font-size: 21px;
      font-weight: 700;
    }

    .product-content .btn { width: 100%; }

    .about { background: var(--light); }

    .about-inner {
      max-width: 1180px;
      margin: auto;
      padding: 40px 18px;
      display: grid;
      grid-template-columns: 1fr 1fr;
      align-items: center;
      gap: 28px;
    }

    .about-image {
      width: 100%;
      height: 300px;
      object-fit: cover;
      border-radius: 12px;
    }

    .about h2 { color: var(--dark); font-size: 29px; }

    .benefits {
      display: grid;
      grid-template-columns: repeat(3, minmax(0, 1fr));
      gap: 16px;
    }

    .benefit {
      padding: 20px;
      border: 1px solid #e5e8dc;
      border-radius: 12px;
      background: white;
      text-align: center;
    }

    .benefit-icon { font-size: 30px; }

    .benefit h3 { color: var(--dark); }

    .cart-area { background: #f1f6ed; }

    .cart-box, .order-box {
      max-width: 850px;
      margin: auto;
      padding: 20px;
      border: 1px solid #e5e8dc;
      border-radius: 12px;
      background: white;
    }

    .cart-row {
      display: grid;
      grid-template-columns: 1fr auto auto auto;
      align-items: center;
      gap: 10px;
      padding: 12px 0;
      border-bottom: 1px solid #e5e8dc;
    }

    .quantity-controls {
      display: flex;
      align-items: center;
      gap: 8px;
    }

    .quantity-controls button, .remove-button {
      padding: 4px 10px;
      border: 1px solid #ddd;
      border-radius: 6px;
      background: #f7f9f4;
    }

    .remove-button { color: #a22; }

    .cart-total {
      margin: 18px 0;
      text-align: right;
      font-size: 20px;
      font-weight: 700;
    }

    .empty-cart { text-align: center; color: #697366; }

    .form-grid {
      display: grid;
      grid-template-columns: 1fr 1fr;
      gap: 14px;
    }

    .form-field { margin-bottom: 12px; }

    .form-field.full { grid-column: 1 / -1; }

    .form-field label {
      display: block;
      margin-bottom: 5px;
      font-weight: 600;
    }

    .form-field input,
    .form-field select,
    .form-field textarea {
      width: 100%;
      padding: 11px;
      border: 1px solid #cfd8cc;
      border-radius: 7px;
      background: white;
    }

    .form-field textarea { min-height: 80px; }

    .summary {
      padding: 14px;
      border-radius: 8px;
      background: var(--light);
      margin: 18px 0;
    }

    .summary-line {
      display: flex;
      justify-content: space-between;
      gap: 12px;
      margin: 5px 0;
    }

    .summary-total {
      margin-top: 10px;
      padding-top: 10px;
      border-top: 1px solid #cbdac8;
      font-size: 20px;
      font-weight: 700;
    }

    .note {
      padding: 12px;
      border-radius: 8px;
      background: #fff8e7;
      font-size: 14px;
    }

    .contact { text-align: center; background: white; }

    .footer {
      padding: 32px 18px 15px;
      background: #143e24;
      color: #f3f7ef;
    }

    .footer-inner {
      max-width: 1180px;
      margin: auto;
      display: grid;
      grid-template-columns: 2fr 1fr 1fr;
      gap: 25px;
    }

    .footer a { display: block; margin: 6px 0; color: #e3eedf; }

    .footer-bottom {
      max-width: 1180px;
      margin: 22px auto 0;
      padding-top: 12px;
      border-top: 1px solid #477153;
      text-align: center;
    }

    .status-message {
      margin-top: 12px;
      padding: 12px;
      border-radius: 8px;
      background: var(--light);
      overflow-wrap: anywhere;
    }

    @media (max-width: 900px) {
      .products { grid-template-columns: repeat(2, minmax(0, 1fr)); }
      .footer-inner { grid-template-columns: 1fr 1fr; }
    }

    @media (max-width: 600px) {
      .logo { font-size: 24px; }
      .nav { gap: 9px 13px; font-size: 14px; }
      .hero { min-height: 350px; }
      .hero-inner { padding: 40px 15px; }
      .hero h1 { font-size: 32px; }
      .hero p { font-size: 16px; }
      .section { padding: 32px 12px; }
      .products { gap: 12px; }
      .product-content { padding: 10px; }
      .product-content h3 { font-size: 17px; }
      .product-price { font-size: 18px; }
      .product-content .btn { padding: 9px 4px; font-size: 14px; }
      .about-inner { grid-template-columns: 1fr; padding: 30px 14px; }
      .about-image { height: 220px; }
      .benefits { grid-template-columns: 1fr; }
      .cart-box, .order-box { padding: 13px; }
      .cart-row { grid-template-columns: 1fr auto; gap: 8px; }
      .form-grid { grid-template-columns: 1fr; }
      .form-field.full { grid-column: auto; }
      .footer-inner { grid-template-columns: 1fr; }
    }
  ]]></b:skin>
</head>

<body>

  <div class='announcement'>🌿 শীতের ঐতিহ্য, গ্রামবাংলার পরিচিত স্বাদ</div>

  <header class='header'>
    <div class='header-inner'>
      <a class='logo' href='/'>🌅 শীতের সকাল</a>
      <nav class='nav'>
        <a href='#home'>হোম</a>
        <a href='#products'>আমাদের পণ্য</a>
        <a href='#about'>আমাদের সম্পর্কে</a>
        <a href='#tracking'>অর্ডার অনুসরণ</a>
        <a href='#contact'>যোগাযোগ</a>
        <a class='cart-nav' href='#cart'>আমার কার্ট (<span id='cartCount'>0</span>)</a>
      </nav>
    </div>
  </header>

  <main id='home'>

    <section class='hero'>
      <div class='hero-inner'>
        <h1>শীতের ঐতিহ্য, গ্রামবাংলার খাঁটি স্বাদ</h1>
        <p>গ্রামবাংলার শীতের প্রিয় খেজুরের রস ও গুড় এখন আপনার ঘরে। পছন্দের পণ্য বেছে নিন, অর্ডার করুন সহজেই।</p>
        <div class='button-row'>
          <a class='btn' href='#order'>এখনই অর্ডার করুন</a>
          <a class='btn btn-light' href='#products'>সব পণ্য দেখুন</a>
        </div>
      </div>
    </section>

    <section class='section' id='products'>
      <div class='section-heading'>
        <h2>আমাদের পণ্যসমূহ</h2>
        <p>আপনার পছন্দের শীতকালীন পণ্য বেছে নিন</p>
      </div>

      <div class='products'>

        <article class='product-card'>
          <img alt='টাটকা খেজুরের রস' src='https://i.ibb.co/h19LPMbj/e99d7689-4052-4aec-b775-1a867763ba6d.png'/>
          <div class='product-content'>
            <h3>টাটকা খেজুরের রস</h3>
            <p class='product-description'>শীতের পরিচিত স্বাদ। ১ লিটার।</p>
            <p class='product-price'>৳১৫০ / লিটার</p>
            <button class='btn' type='button' onclick="addToCart('juice')">কার্টে যোগ করুন</button>
          </div>
        </article>

        <article class='product-card'>
          <img alt='খাঁটি ঝোলা গুড়' src='https://i.ibb.co/yBWbgFwg/c257ebd0-c9eb-4df5-99cd-6bcef2d50a7f.png'/>
          <div class='product-content'>
            <h3>খাঁটি ঝোলা গুড়</h3>
            <p class='product-description'>ঝোলা গুড়। ৫০০ গ্রাম।</p>
            <p class='product-price'>৳১৫০ / ৫০০ গ্রাম</p>
            <button class='btn' type='button' onclick="addToCart('jhola')">কার্টে যোগ করুন</button>
          </div>
        </article>

        <article class='product-card'>
          <img alt='খেজুরের পাটালি গুড়' src='https://i.ibb.co/yBkxGnzH/c19fe558-a75f-4111-b015-64e29e86692e.png'/>
          <div class='product-content'>
            <h3>খেজুরের পাটালি গুড়</h3>
            <p class='product-description'>ঐতিহ্যবাহী পাটালি গুড়। ১ কেজি।</p>
            <p class='product-price'>৳৩৫০ / কেজি</p>
            <button class='btn' type='button' onclick="addToCart('patali')">কার্টে যোগ করুন</button>
          </div>
        </article>

        <article class='product-card'>
          <img alt='নলেন গুড়' src='https://i.ibb.co/mVWbf8w0/549006fc-70ff-4a6e-b8fa-aa2af4c18f6f.png'/>
          <div class='product-content'>
            <h3>নলেন গুড়</h3>
            <p class='product-description'>শীতের বিশেষ স্বাদের গুড়। ১ কেজি।</p>
            <p class='product-price'>৳৩২০ / কেজি</p>
            <button class='btn' type='button' onclick="addToCart('nolen')">কার্টে যোগ করুন</button>
          </div>
        </article>

        <article class='product-card'>
          <img alt='খেজুরের গুড়ের উপহার প্যাকেট' src='https://i.ibb.co/yBkxGnzH/c19fe558-a75f-4111-b015-64e29e86692e.png'/>
          <div class='product-content'>
            <h3>খেজুরের গুড়ের উপহার প্যাকেট</h3>
            <p class='product-description'>উপহার প্যাকেটের মূল্য অর্ডারের আগে নিশ্চিত করুন।</p>
            <p class='product-price'>দাম জানতে যোগাযোগ করুন</p>
            <button class='btn' type='button' onclick="addToCart('gift')">কার্টে যোগ করুন</button>
          </div>
        </article>

      </div>
    </section>

    <section class='about' id='about'>
      <div class='about-inner'>
        <img class='about-image' alt='গ্রামবাংলার শীতের সকাল' src='https://images.unsplash.com/photo-1470252649378-9c29740c9fa8?auto=format&amp;fit=crop&amp;w=900&amp;q=80'/>
        <div>
          <h2>গ্রামবাংলার মাটি থেকে আপনার ঘরে</h2>
          <p>শীতের ঐতিহ্য ও গ্রামবাংলার পরিচিত স্বাদ নিয়ে আমাদের পথচলা। যত্নসহকারে সংগ্রহ করা খেজুরের রস ও গুড় ক্রেতাদের কাছে পৌঁছে দেওয়াই আমাদের লক্ষ্য।</p>
          <a class='btn' href='#products'>পণ্য দেখুন</a>
        </div>
      </div>
    </section>

    <section class='section'>
      <div class='section-heading'>
        <h2>কেন আমাদের কাছ থেকে কিনবেন</h2>
        <p>সহজ অর্ডার ও পরিষ্কার তথ্য</p>
      </div>
      <div class='benefits'>
        <div class='benefit'>
          <div class='benefit-icon'>🌴</div>
          <h3>গ্রামীণ ঐতিহ্য</h3>
          <p>বাংলার শীতকালীন পরিচিত পণ্য।</p>
        </div>
        <div class='benefit'>
          <div class='benefit-icon'>📦</div>
          <h3>প্যাকেজিং</h3>
          <p>প্যাকেজিং ও ডেলিভারির তথ্য অর্ডারের আগে নিশ্চিত করুন।</p>
        </div>
        <div class='benefit'>
          <div class='benefit-icon'>💬</div>
          <h3>সরাসরি যোগাযোগ</h3>
          <p>WhatsApp-এ অর্ডারের বিষয়ে যোগাযোগ করুন।</p>
        </div>
      </div>
    </section>

    <section class='section cart-area' id='cart'>
      <div class='section-heading'>
        <h2>আমার কার্ট</h2>
        <p>পরিমাণ পরিবর্তন করুন অথবা পণ্য সরিয়ে দিন</p>
      </div>
      <div class='cart-box'>
        <div id='cartItems'><p class='empty-cart'>আপনার কার্ট এখন খালি।</p></div>
        <div class='cart-total'>পণ্যের মোট: <span id='cartSubtotal'>৳০</span></div>
        <a class='btn' href='#order'>অর্ডার ফর্মে যান</a>
      </div>
    </section>

    <section class='section' id='order'>
      <div class='section-heading'>
        <h2>অর্ডার ফর্ম</h2>
        <p>আপনার সঠিক তথ্য দিয়ে অর্ডার প্রস্তুত করুন</p>
      </div>
      <div class='order-box'>
        <form id='orderForm' onsubmit='return submitOrder(event)'>
          <div class='form-grid'>
            <div class='form-field'>
              <label for='customerName'>আপনার নাম *</label>
              <input id='customerName' required='required' type='text' placeholder='সম্পূর্ণ নাম'/>
            </div>
            <div class='form-field'>
              <label for='customerPhone'>মোবাইল নম্বর *</label>
              <input id='customerPhone' required='required' type='tel' placeholder='মোবাইল নম্বর'/>
            </div>
            <div class='form-field'>
              <label for='customerVillage'>গ্রাম *</label>
              <input id='customerVillage' required='required' type='text' placeholder='গ্রামের নাম'/>
            </div>
            <div class='form-field'>
              <label for='customerUnion'>ইউনিয়ন / ওয়ার্ড *</label>
              <input id='customerUnion' required='required' type='text' placeholder='ইউনিয়ন বা ওয়ার্ড'/>
            </div>
            <div class='form-field'>
              <label for='customerUpazila'>উপজেলা *</label>
              <input id='customerUpazila' required='required' type='text' placeholder='উপজেলার নাম'/>
            </div>
            <div class='form-field'>
              <label for='customerDistrict'>জেলা *</label>
              <input id='customerDistrict' required='required' type='text' placeholder='জেলার নাম'/>
            </div>
            <div class='form-field full'>
              <label for='customerAddress'>বাড়ি / রাস্তা / সম্পূর্ণ ঠিকানা *</label>
              <textarea id='customerAddress' required='required' placeholder='বিস্তারিত ঠিকানা'></textarea>
            </div>
            <div class='form-field full'>
              <label for='orderNote'>অতিরিক্ত নির্দেশনা</label>
              <textarea id='orderNote' placeholder='ঐচ্ছিক'></textarea>
            </div>
          </div>

          <div class='summary'>
            <div class='summary-line'><span>পণ্যের মোট মূল্য</span><strong id='summarySubtotal'>৳০</strong></div>
            <div class='summary-line'><span>ডেলিভারি চার্জ</span><strong>WhatsApp-এ নিশ্চিত হবে</strong></div>
            <div class='summary-line summary-total'><span>সর্বমোট</span><strong id='summaryGrand'>ডেলিভারি চার্জসহ নিশ্চিত হবে</strong></div>
          </div>

          <p class='note'>অর্ডার WhatsApp-এ পাঠানোর পর Send চাপুন। এই থিম একা অর্ডার ডেটাবেসে সংরক্ষণ করে না।</p>
          <button class='btn' style='width:100%' type='submit'>WhatsApp-এ অর্ডার পাঠান</button>
          <div id='orderMessage' class='status-message' hidden='hidden'></div>
        </form>
      </div>
    </section>

    <section class='section' id='tracking'>
      <div class='section-heading'>
        <h2>অর্ডার অনুসরণ</h2>
        <p>অর্ডারের অবস্থা জানতে যোগাযোগ করুন</p>
      </div>
      <div class='order-box'>
        <p>ডেটাবেসভিত্তিক অর্ডার ট্র্যাকিং এখনো সংযুক্ত নয়। অর্ডারের অবস্থা জানতে WhatsApp-এ যোগাযোগ করুন।</p>
        <a class='btn' href='https://wa.me/8801315868019' target='_blank' rel='noopener noreferrer'>WhatsApp-এ খোঁজ নিন</a>
      </div>
    </section>

    <section class='section contact' id='contact'>
      <div class='section-heading'>
        <h2>যোগাযোগ করুন</h2>
        <p>অর্ডার ও পণ্যের তথ্য জানতে WhatsApp-এ যোগাযোগ করুন</p>
      </div>
      <p><strong>ব্যবসার নাম:</strong> শীতের সকাল</p>
      <p><strong>WhatsApp:</strong> 01315868019</p>
      <a class='btn' href='https://wa.me/8801315868019' target='_blank' rel='noopener noreferrer'>WhatsApp-এ যোগাযোগ</a>
    </section>

  </main>

  <footer class='footer'>
    <div class='footer-inner'>
      <div>
        <h3>🌅 শীতের সকাল</h3>
        <p>গ্রামবাংলার শীতের ঐতিহ্য ও পরিচিত স্বাদের অনলাইন দোকান।</p>
      </div>
      <div>
        <h3>দরকারি লিংক</h3>
        <a href='#products'>আমাদের পণ্য</a>
        <a href='#about'>আমাদের সম্পর্কে</a>
        <a href='#order'>অর্ডার করুন</a>
        <a href='#tracking'>অর্ডার অনুসরণ</a>
      </div>
      <div>
        <h3>নীতি ও সহায়তা</h3>
        <a href='#contact'>ডেলিভারি নীতি জানতে যোগাযোগ</a>
        <a href='#contact'>ফেরত নীতি জানতে যোগাযোগ</a>
        <a href='#contact'>গোপনীয়তা নীতি জানতে যোগাযোগ</a>
      </div>
    </div>
    <div class='footer-bottom'>© শীতের সকাল | সর্বস্বত্ব সংরক্ষিত</div>
  </footer>

  <b:section id='main' class='blog-area' maxwidgets='1' showaddelement='no'>
    <b:widget id='Blog1' locked='true' title='ব্লগ পোস্ট' type='Blog' version='2' visible='false'>
      <b:widget-settings>
        <b:widget-setting name='showDateHeader'>false</b:widget-setting>
        <b:widget-setting name='showShareButtons'>false</b:widget-setting>
        <b:widget-setting name='showCommentLink'>false</b:widget-setting>
        <b:widget-setting name='showAuthor'>false</b:widget-setting>
      </b:widget-settings>
      <b:includable id='main'>
        <div class='blog-posts'>
          <b:loop values='data:posts' var='post'>
            <article class='post'>
              <h2><a expr:href='data:post.url'><data:post.title/></a></h2>
              <div><data:post.body/></div>
            </article>
          </b:loop>
        </div>
      </b:includable>
    </b:widget>
  </b:section>

  <script type='text/javascript'>
  //<![CDATA[
  (function () {
    var products = {
      juice: {name:'টাটকা খেজুরের রস', price:150, unit:'লিটার'},
      jhola: {name:'খাঁটি ঝোলা গুড়', price:150, unit:'৫০০ গ্রাম'},
      patali: {name:'খেজুরের পাটালি গুড়', price:350, unit:'কেজি'},
      nolen: {name:'নলেন গুড়', price:320, unit:'কেজি'},
      gift: {name:'খেজুরের গুড়ের উপহার প্যাকেট', price:0, unit:'প্যাকেট'}
    };

    var cart = {};

    function money(value) {
      return '৳' + Number(value).toLocaleString('en-US');
    }

    function subtotal() {
      var total = 0;
      Object.keys(cart).forEach(function (key) {
        total += products[key].price * cart[key];
      });
      return total;
    }

    function updateCart() {
      var container = document.getElementById('cartItems');
      var count = 0;
      var html = '';

      Object.keys(cart).forEach(function (key) {
        count += cart[key];
        var item = products[key];

        html += '<div class="cart-row">' +
          '<div><strong>' + item.name + '</strong><br/><small>' +
          (item.price ? money(item.price) + ' / ' + item.unit : 'দাম নিশ্চিত করতে হবে') +
          '</small></div>' +
          '<div class="quantity-controls">' +
          '<button type="button" onclick="changeQuantity(\'' + key + '\',-1)">−</button>' +
          '<span>' + cart[key] + '</span>' +
          '<button type="button" onclick="changeQuantity(\'' + key + '\',1)">+</button></div>' +
          '<strong>' + (item.price ? money(item.price * cart[key]) : 'দাম নিশ্চিত হবে') + '</strong>' +
          '<button type="button" class="remove-button" onclick="removeProduct(\'' + key + '\')">সরান</button>' +
          '</div>';
      });

      container.innerHTML = html || '<p class="empty-cart">আপনার কার্ট এখন খালি।</p>';
      document.getElementById('cartCount').textContent = count;
      document.getElementById('cartSubtotal').textContent = money(subtotal());
      document.getElementById('summarySubtotal').textContent = money(subtotal());
      document.getElementById('summaryGrand').textContent = 'ডেলিভারি চার্জসহ নিশ্চিত হবে';
    }

    window.addToCart = function (key) {
      if (!products[key]) return;
      cart[key] = (cart[key] || 0) + 1;
      updateCart();
      document.getElementById('cart').scrollIntoView({behavior:'smooth'});
    };

    window.changeQuantity = function (key, delta) {
      if (!cart[key]) return;
      cart[key] += delta;
      if (cart[key] <= 0) delete cart[key];
      updateCart();
    };

    window.removeProduct = function (key) {
      delete cart[key];
      updateCart();
    };

    window.submitOrder = function (event) {
      event.preventDefault();

      var box = document.getElementById('orderMessage');

      if (Object.keys(cart).length === 0) {
        box.hidden = false;
        box.textContent = 'প্রথমে কার্টে পণ্য যোগ করুন।';
        return false;
      }

      var ids = ['customerName','customerPhone','customerVillage','customerUnion','customerUpazila','customerDistrict','customerAddress'];
      var values = {};

      for (var i = 0; i < ids.length; i++) {
        values[ids[i]] = document.getElementById(ids[i]).value.trim();
        if (!values[ids[i]]) {
          box.hidden = false;
          box.textContent = 'সব প্রয়োজনীয় তথ্য পূরণ করুন।';
          return false;
        }
      }

      var orderNumber = 'SS-' + Date.now().toString().slice(-8);
      var lines = [
        'নতুন অর্ডার - শীতের সকাল',
        'রেফারেন্স: ' + orderNumber,
        'নাম: ' + values.customerName,
        'মোবাইল: ' + values.customerPhone,
        'ঠিকানা: ' + values.customerVillage + ', ' +
          values.customerUnion + ', ' + values.customerUpazila + ', ' +
          values.customerDistrict,
        'বিস্তারিত: ' + values.customerAddress,
        '',
        'পণ্যসমূহ:'
      ];

      Object.keys(cart).forEach(function (key) {
        var p = products[key];
        lines.push(p.name + ' × ' + cart[key] + ' = ' +
          (p.price ? money(p.price * cart[key]) : 'দাম নিশ্চিত করতে হবে'));
      });

      lines.push('');
      lines.push('পণ্যের মোট: ' + money(subtotal()));
      lines.push('ডেলিভারি চার্জ: নিশ্চিত করতে হবে');
      lines.push('সর্বমোট: ডেলিভারি চার্জসহ নিশ্চিত হবে');
      lines.push('অতিরিক্ত নির্দেশনা: ' +
        (document.getElementById('orderNote').value.trim() || 'নেই'));
      lines.push('অনুগ্রহ করে অর্ডার ও ডেলিভারি চার্জ নিশ্চিত করুন।');

      var url = 'https://wa.me/8801315868019?text=' +
        encodeURIComponent(lines.join('\n'));

      box.hidden = false;
      box.textContent = 'WhatsApp-এ অর্ডারের খসড়া খুলবে। Send চাপার আগে তথ্য যাচাই করুন। রেফারেন্স নম্বর: ' + orderNumber;

      window.open(url, '_blank');
      return false;
    };

    updateCart();
  })();
  //]]>
  </script>

</body>
</html>
