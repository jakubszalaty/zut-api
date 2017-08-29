package p022b;

import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.xml.parsers.SAXParserFactory;
import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.DefaultHandler;

/* renamed from: b.h */
public class C0640h extends DefaultHandler {
    public ArrayList<C0639b> f1927a;
    private StringBuilder f1928b;
    private boolean f1929c;
    private boolean f1930d;
    private boolean f1931e;
    private C0638a f1932f;
    private C0639b f1933g;

    /* renamed from: b.h.a */
    public class C0638a {
        public String f1901a;
        public String f1902b;
        public String f1903c;
        public String f1904d;
        public String f1905e;
        public String f1906f;
        public String f1907g;
        public String f1908h;
        public String f1909i;
        public String f1910j;
        public String f1911k;
        public String f1912l;
        public String f1913m;
        public String f1914n;
        public String f1915o;
        public String f1916p;
        final /* synthetic */ C0640h f1917q;

        public C0638a(C0640h c0640h) {
            this.f1917q = c0640h;
        }
    }

    /* renamed from: b.h.b */
    public class C0639b {
        public String f1918a;
        public String f1919b;
        public String f1920c;
        public String f1921d;
        public String f1922e;
        public String f1923f;
        public String f1924g;
        public String f1925h;
        final /* synthetic */ C0640h f1926i;

        public C0639b(C0640h c0640h) {
            this.f1926i = c0640h;
        }
    }

    public C0640h(String str) {
        this.f1927a = new ArrayList();
        this.f1932f = new C0638a(this);
        try {
            XMLReader xMLReader = SAXParserFactory.newInstance().newSAXParser().getXMLReader();
            InputSource inputSource = new InputSource(new StringReader(str));
            xMLReader.setContentHandler(this);
            xMLReader.parse(inputSource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String m3204a(String str) {
        try {
            str = new SimpleDateFormat("dd.MM.yyyy").format(new Date(str));
        } catch (Exception e) {
        }
        return str;
    }

    public C0639b m3205a(int i) {
        return (C0639b) this.f1927a.get(i);
    }

    public void characters(char[] cArr, int i, int i2) {
        if (this.f1928b != null) {
            this.f1928b.append(cArr, i, i2);
        }
    }

    public void endDocument() {
    }

    public void endElement(String str, String str2, String str3) {
        if (str2.equalsIgnoreCase("image")) {
            this.f1930d = false;
        }
        if (str2.equalsIgnoreCase("channel")) {
            this.f1929c = false;
        }
        if (str2.equalsIgnoreCase("item")) {
            this.f1931e = false;
        }
        if (str2.equalsIgnoreCase("title")) {
            if (this.f1928b != null) {
                if (this.f1931e) {
                    this.f1933g.f1918a = this.f1928b.toString();
                } else if (this.f1930d) {
                    this.f1932f.f1905e = this.f1928b.toString();
                } else if (this.f1929c) {
                    this.f1932f.f1901a = this.f1928b.toString();
                }
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("description")) {
            if (this.f1928b != null) {
                if (this.f1931e) {
                    this.f1933g.f1919b = this.f1928b.toString();
                } else if (this.f1930d) {
                    this.f1932f.f1909i = this.f1928b.toString();
                } else if (this.f1929c) {
                    this.f1932f.f1902b = this.f1928b.toString();
                }
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("link")) {
            if (this.f1928b != null) {
                if (this.f1931e) {
                    this.f1933g.f1920c = this.f1928b.toString();
                } else if (this.f1930d) {
                    this.f1932f.f1906f = this.f1928b.toString();
                } else if (this.f1929c) {
                    this.f1932f.f1903c = this.f1928b.toString();
                }
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("category")) {
            if (this.f1928b != null) {
                if (this.f1931e) {
                    this.f1933g.f1921d = this.f1928b.toString();
                } else if (this.f1929c) {
                    this.f1932f.f1913m = this.f1928b.toString();
                }
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("pubDate")) {
            if (this.f1928b != null) {
                if (this.f1931e) {
                    this.f1933g.f1922e = m3204a(this.f1928b.toString());
                } else if (this.f1929c) {
                    this.f1932f.f1912l = m3204a(this.f1928b.toString());
                }
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("guid")) {
            if (this.f1928b != null) {
                this.f1933g.f1923f = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("url")) {
            if (this.f1928b != null) {
                this.f1932f.f1904d = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("width")) {
            if (this.f1928b != null) {
                this.f1932f.f1907g = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("height")) {
            if (this.f1928b != null) {
                this.f1932f.f1908h = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("language")) {
            if (this.f1928b != null) {
                this.f1932f.f1910j = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("copyright")) {
            if (this.f1928b != null) {
                this.f1932f.f1911k = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("ttl")) {
            if (this.f1928b != null) {
                this.f1932f.f1914n = this.f1928b.toString();
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("author")) {
            if (this.f1928b != null) {
                if (this.f1931e) {
                    this.f1933g.f1924g = this.f1928b.toString();
                } else if (this.f1929c) {
                    this.f1932f.f1915o = this.f1928b.toString();
                }
                this.f1928b = null;
            } else {
                return;
            }
        }
        if (str2.equalsIgnoreCase("encoded") && this.f1928b != null) {
            if (this.f1931e) {
                this.f1933g.f1925h = this.f1928b.toString();
            } else if (this.f1929c) {
                this.f1932f.f1916p = this.f1928b.toString();
            }
            this.f1928b = null;
        }
    }

    public void startDocument() {
    }

    public void startElement(String str, String str2, String str3, Attributes attributes) {
        if (str2.equalsIgnoreCase("image")) {
            this.f1930d = true;
        }
        if (str2.equalsIgnoreCase("channel")) {
            this.f1929c = true;
        }
        if (str2.equalsIgnoreCase("item")) {
            this.f1933g = new C0639b(this);
            this.f1927a.add(this.f1933g);
            this.f1931e = true;
        }
        this.f1928b = new StringBuilder();
    }
}
