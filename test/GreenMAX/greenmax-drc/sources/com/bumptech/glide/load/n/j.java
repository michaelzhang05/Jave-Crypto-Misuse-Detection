package com.bumptech.glide.load.n;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* compiled from: LazyHeaders.java */
/* loaded from: classes.dex */
public final class j implements h {

    /* renamed from: c, reason: collision with root package name */
    private final Map<String, List<i>> f8719c;

    /* renamed from: d, reason: collision with root package name */
    private volatile Map<String, String> f8720d;

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    public static final class a {
        private static final String a;

        /* renamed from: b, reason: collision with root package name */
        private static final Map<String, List<i>> f8721b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f8722c = true;

        /* renamed from: d, reason: collision with root package name */
        private Map<String, List<i>> f8723d = f8721b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f8724e = true;

        static {
            String b2 = b();
            a = b2;
            HashMap hashMap = new HashMap(2);
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put("User-Agent", Collections.singletonList(new b(b2)));
            }
            f8721b = Collections.unmodifiableMap(hashMap);
        }

        static String b() {
            String property = System.getProperty("http.agent");
            if (TextUtils.isEmpty(property)) {
                return property;
            }
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i2 = 0; i2 < length; i2++) {
                char charAt = property.charAt(i2);
                if ((charAt > 31 || charAt == '\t') && charAt < 127) {
                    sb.append(charAt);
                } else {
                    sb.append('?');
                }
            }
            return sb.toString();
        }

        public j a() {
            this.f8722c = true;
            return new j(this.f8723d);
        }
    }

    /* compiled from: LazyHeaders.java */
    /* loaded from: classes.dex */
    static final class b implements i {
        private final String a;

        b(String str) {
            this.a = str;
        }

        @Override // com.bumptech.glide.load.n.i
        public String a() {
            return this.a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a.equals(((b) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }

        public String toString() {
            return "StringHeaderFactory{value='" + this.a + "'}";
        }
    }

    j(Map<String, List<i>> map) {
        this.f8719c = Collections.unmodifiableMap(map);
    }

    private String b(List<i> list) {
        StringBuilder sb = new StringBuilder();
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            String a2 = list.get(i2).a();
            if (!TextUtils.isEmpty(a2)) {
                sb.append(a2);
                if (i2 != list.size() - 1) {
                    sb.append(',');
                }
            }
        }
        return sb.toString();
    }

    private Map<String, String> c() {
        HashMap hashMap = new HashMap();
        for (Map.Entry<String, List<i>> entry : this.f8719c.entrySet()) {
            String b2 = b(entry.getValue());
            if (!TextUtils.isEmpty(b2)) {
                hashMap.put(entry.getKey(), b2);
            }
        }
        return hashMap;
    }

    @Override // com.bumptech.glide.load.n.h
    public Map<String, String> a() {
        if (this.f8720d == null) {
            synchronized (this) {
                if (this.f8720d == null) {
                    this.f8720d = Collections.unmodifiableMap(c());
                }
            }
        }
        return this.f8720d;
    }

    public boolean equals(Object obj) {
        if (obj instanceof j) {
            return this.f8719c.equals(((j) obj).f8719c);
        }
        return false;
    }

    public int hashCode() {
        return this.f8719c.hashCode();
    }

    public String toString() {
        return "LazyHeaders{headers=" + this.f8719c + '}';
    }
}
