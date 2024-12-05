package org.apache.cordova;

import android.content.Context;
import m5.j;
import org.xmlpull.v1.XmlPullParser;

/* loaded from: classes.dex */
public class AllowListPlugin extends org.apache.cordova.b {
    public static final String PLUGIN_NAME = "CordovaAllowListPlugin";

    /* renamed from: c, reason: collision with root package name */
    private m5.a f8282c;

    /* renamed from: d, reason: collision with root package name */
    private m5.a f8283d;

    /* renamed from: e, reason: collision with root package name */
    private m5.a f8284e;

    /* loaded from: classes.dex */
    private class b extends m5.d {

        /* renamed from: j, reason: collision with root package name */
        private j f8285j;

        private b() {
            this.f8285j = new j();
        }

        @Override // m5.d
        public void c(XmlPullParser xmlPullParser) {
        }

        @Override // m5.d
        public void d(XmlPullParser xmlPullParser) {
            String attributeValue;
            String attributeValue2;
            m5.a aVar;
            String name = xmlPullParser.getName();
            boolean z5 = false;
            if (name.equals("content")) {
                attributeValue2 = xmlPullParser.getAttributeValue(null, "src");
            } else {
                if (!name.equals("allow-navigation")) {
                    if (name.equals("allow-intent")) {
                        attributeValue2 = xmlPullParser.getAttributeValue(null, "href");
                        aVar = AllowListPlugin.this.f8283d;
                        aVar.a(attributeValue2, false);
                    } else {
                        if (!name.equals("access") || (attributeValue = xmlPullParser.getAttributeValue(null, "origin")) == null) {
                            return;
                        }
                        if ("*".equals(attributeValue)) {
                            AllowListPlugin.this.f8284e.a("http://*/*", false);
                            AllowListPlugin.this.f8284e.a("https://*/*", false);
                            return;
                        }
                        String attributeValue3 = xmlPullParser.getAttributeValue(null, "subdomains");
                        m5.a aVar2 = AllowListPlugin.this.f8284e;
                        if (attributeValue3 != null && attributeValue3.compareToIgnoreCase("true") == 0) {
                            z5 = true;
                        }
                        aVar2.a(attributeValue, z5);
                        return;
                    }
                }
                attributeValue2 = xmlPullParser.getAttributeValue(null, "href");
                if ("*".equals(attributeValue2)) {
                    AllowListPlugin.this.f8282c.a("http://*/*", false);
                    AllowListPlugin.this.f8282c.a("https://*/*", false);
                    AllowListPlugin.this.f8282c.a("data:*", false);
                    return;
                }
            }
            aVar = AllowListPlugin.this.f8282c;
            aVar.a(attributeValue2, false);
        }
    }

    public AllowListPlugin() {
    }

    public AllowListPlugin(Context context) {
        this(new m5.a(), new m5.a(), null);
        new b().e(context);
    }

    public m5.a getAllowedIntents() {
        return this.f8283d;
    }

    public m5.a getAllowedNavigations() {
        return this.f8282c;
    }

    public m5.a getAllowedRequests() {
        return this.f8284e;
    }

    @Override // org.apache.cordova.b
    public void pluginInitialize() {
        if (this.f8282c == null) {
            this.f8282c = new m5.a();
            this.f8283d = new m5.a();
            this.f8284e = new m5.a();
            new b().e(this.webView.getContext());
        }
    }

    public void setAllowedIntents(m5.a aVar) {
        this.f8283d = aVar;
    }

    public void setAllowedNavigations(m5.a aVar) {
        this.f8282c = aVar;
    }

    public void setAllowedRequests(m5.a aVar) {
        this.f8284e = aVar;
    }

    @Override // org.apache.cordova.b
    public Boolean shouldAllowNavigation(String str) {
        if (this.f8282c.b(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    @Override // org.apache.cordova.b
    public Boolean shouldAllowRequest(String str) {
        Boolean bool = Boolean.TRUE;
        if (bool.equals(shouldAllowNavigation(str)) || this.f8284e.b(str)) {
            return bool;
        }
        return null;
    }

    @Override // org.apache.cordova.b
    public Boolean shouldOpenExternalUrl(String str) {
        if (this.f8283d.b(str)) {
            return Boolean.TRUE;
        }
        return null;
    }

    public AllowListPlugin(m5.a aVar, m5.a aVar2, m5.a aVar3) {
        if (aVar3 == null) {
            aVar3 = new m5.a();
            aVar3.a("file:///*", false);
            aVar3.a("data:*", false);
        }
        this.f8282c = aVar;
        this.f8283d = aVar2;
        this.f8284e = aVar3;
    }

    public AllowListPlugin(XmlPullParser xmlPullParser) {
        this(new m5.a(), new m5.a(), null);
        new b().f(xmlPullParser);
    }
}
