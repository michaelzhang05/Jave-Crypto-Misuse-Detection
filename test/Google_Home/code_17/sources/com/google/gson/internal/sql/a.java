package com.google.gson.internal.sql;

import com.google.gson.internal.bind.DefaultDateTypeAdapter;
import com.google.gson.r;
import java.sql.Date;
import java.sql.Timestamp;

/* loaded from: classes4.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f18841a;

    /* renamed from: b, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f18842b;

    /* renamed from: c, reason: collision with root package name */
    public static final DefaultDateTypeAdapter.a f18843c;

    /* renamed from: d, reason: collision with root package name */
    public static final r f18844d;

    /* renamed from: e, reason: collision with root package name */
    public static final r f18845e;

    /* renamed from: f, reason: collision with root package name */
    public static final r f18846f;

    /* renamed from: com.google.gson.internal.sql.a$a, reason: collision with other inner class name */
    /* loaded from: classes4.dex */
    class C0383a extends DefaultDateTypeAdapter.a {
        C0383a(Class cls) {
            super(cls);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Date a(java.util.Date date) {
            return new Date(date.getTime());
        }
    }

    /* loaded from: classes4.dex */
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
        f18841a = z8;
        if (z8) {
            f18842b = new C0383a(Date.class);
            f18843c = new b(Timestamp.class);
            f18844d = SqlDateTypeAdapter.f18835b;
            f18845e = SqlTimeTypeAdapter.f18837b;
            f18846f = SqlTimestampTypeAdapter.f18839b;
            return;
        }
        f18842b = null;
        f18843c = null;
        f18844d = null;
        f18845e = null;
        f18846f = null;
    }
}
