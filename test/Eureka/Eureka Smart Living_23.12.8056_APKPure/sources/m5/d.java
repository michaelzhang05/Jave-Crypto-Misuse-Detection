package m5;

import android.content.Context;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.cordova.AllowListPlugin;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* loaded from: classes.dex */
public class d {

    /* renamed from: i, reason: collision with root package name */
    private static String f7915i = "ConfigXmlParser";

    /* renamed from: a, reason: collision with root package name */
    private String f7916a;

    /* renamed from: b, reason: collision with root package name */
    private j f7917b = new j();

    /* renamed from: c, reason: collision with root package name */
    private ArrayList f7918c = new ArrayList(20);

    /* renamed from: d, reason: collision with root package name */
    boolean f7919d = false;

    /* renamed from: e, reason: collision with root package name */
    String f7920e = "";

    /* renamed from: f, reason: collision with root package name */
    String f7921f = "";

    /* renamed from: g, reason: collision with root package name */
    String f7922g = "";

    /* renamed from: h, reason: collision with root package name */
    boolean f7923h = false;

    public ArrayList a() {
        return this.f7918c;
    }

    public j b() {
        return this.f7917b;
    }

    public void c(XmlPullParser xmlPullParser) {
        if (xmlPullParser.getName().equals("feature")) {
            this.f7918c.add(new q(this.f7920e, this.f7921f, this.f7923h));
            this.f7920e = "";
            this.f7921f = "";
            this.f7919d = false;
            this.f7923h = false;
        }
    }

    public void d(XmlPullParser xmlPullParser) {
        String attributeValue;
        String name = xmlPullParser.getName();
        if (name.equals("feature")) {
            this.f7919d = true;
            attributeValue = xmlPullParser.getAttributeValue(null, "name");
        } else {
            if (!this.f7919d || !name.equals("param")) {
                if (name.equals("preference")) {
                    this.f7917b.d(xmlPullParser.getAttributeValue(null, "name").toLowerCase(Locale.ENGLISH), xmlPullParser.getAttributeValue(null, "value"));
                    return;
                } else {
                    if (name.equals("content")) {
                        String attributeValue2 = xmlPullParser.getAttributeValue(null, "src");
                        if (attributeValue2 == null) {
                            attributeValue2 = "index.html";
                        }
                        this.f7916a = attributeValue2;
                        return;
                    }
                    return;
                }
            }
            String attributeValue3 = xmlPullParser.getAttributeValue(null, "name");
            this.f7922g = attributeValue3;
            if (!attributeValue3.equals("service")) {
                if (this.f7922g.equals("package") || this.f7922g.equals("android-package")) {
                    this.f7921f = xmlPullParser.getAttributeValue(null, "value");
                    return;
                } else {
                    if (this.f7922g.equals("onload")) {
                        this.f7923h = "true".equals(xmlPullParser.getAttributeValue(null, "value"));
                        return;
                    }
                    return;
                }
            }
            attributeValue = xmlPullParser.getAttributeValue(null, "value");
        }
        this.f7920e = attributeValue;
    }

    public void e(Context context) {
        int identifier = context.getResources().getIdentifier("config", "xml", context.getClass().getPackage().getName());
        if (identifier == 0 && (identifier = context.getResources().getIdentifier("config", "xml", context.getPackageName())) == 0) {
            o.c(f7915i, "res/xml/config.xml is missing!");
        } else {
            this.f7918c.add(new q(AllowListPlugin.PLUGIN_NAME, "org.apache.cordova.AllowListPlugin", true));
            f(context.getResources().getXml(identifier));
        }
    }

    public void f(XmlPullParser xmlPullParser) {
        int i6 = -1;
        while (i6 != 1) {
            if (i6 == 2) {
                d(xmlPullParser);
            } else if (i6 == 3) {
                c(xmlPullParser);
            }
            try {
                i6 = xmlPullParser.next();
            } catch (IOException e6) {
                e6.printStackTrace();
            } catch (XmlPullParserException e7) {
                e7.printStackTrace();
            }
        }
    }
}
