package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.r;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes3.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f17786a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f17787b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f17788c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f17789d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f17790e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f17791f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* loaded from: classes3.dex */
    class C0387a extends DefaultDateTypeAdapter.a {
        C0387a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* loaded from: classes3.dex */
    class b extends DefaultDateTypeAdapter.a {
        b(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Timestamp a(java.util.Date date) {
            return new Timestamp(date.getTime());
        }
    }

    static {
        boolean z8;
        try {
            Class.forName("java.sql.Date");
            z8 = true;
        } catch (ClassNotFoundException unused) {
            z8 = false;
        }
        f17786a = z8;
        if (z8) {
            f17787b = new C0387a(Date.class);
            f17788c = new b(Timestamp.class);
            f17789d = SqlDateTypeAdapter.f17780b;
            f17790e = SqlTimeTypeAdapter.f17782b;
            f17791f = SqlTimestampTypeAdapter.f17784b;
            return;
        }
        f17787b = null;
        f17788c = null;
        f17789d = null;
        f17790e = null;
        f17791f = null;
    }
}
