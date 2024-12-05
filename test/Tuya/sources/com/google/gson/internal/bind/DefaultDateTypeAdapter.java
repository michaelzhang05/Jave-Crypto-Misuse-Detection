package com.google.gson.internal.bind;

import com.google.gson.TypeAdapter;
import com.google.gson.m;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import n1.AbstractC3450a;
import p1.C3596a;
import p1.EnumC3597b;
import p1.c;

/* loaded from: classes3.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final a f17590a;

    /* renamed from: b, reason: collision with root package name */
    private final List f17591b;

    /* loaded from: classes3.dex */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f17592b = new C0383a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class f17593a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        /* loaded from: classes3.dex */
        class C0383a extends a {
            C0383a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected Date a(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Class cls) {
            this.f17593a = cls;
        }

        protected abstract Date a(Date date);
    }

    private Date e(C3596a c3596a) {
        String L8 = c3596a.L();
        synchronized (this.f17591b) {
            try {
                Iterator it = this.f17591b.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(L8);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return AbstractC3450a.c(L8, new ParsePosition(0));
                } catch (ParseException e8) {
                    throw new m("Failed parsing '" + L8 + "' as Date; at path " + c3596a.r(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(C3596a c3596a) {
        if (c3596a.N() == EnumC3597b.NULL) {
            c3596a.J();
            return null;
        }
        return this.f17590a.a(e(c3596a));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.x();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f17591b.get(0);
        synchronized (this.f17591b) {
            format = dateFormat.format(date);
        }
        cVar.Q(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f17591b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
