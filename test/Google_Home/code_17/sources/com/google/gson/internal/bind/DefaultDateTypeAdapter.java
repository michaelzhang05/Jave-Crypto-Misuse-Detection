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
import q1.AbstractC3829a;
import s1.C3990a;
import s1.EnumC3991b;
import s1.c;

/* loaded from: classes4.dex */
public final class DefaultDateTypeAdapter<T extends Date> extends TypeAdapter {

    /* renamed from: a, reason: collision with root package name */
    private final a f18645a;

    /* renamed from: b, reason: collision with root package name */
    private final List f18646b;

    /* loaded from: classes4.dex */
    public static abstract class a {

        /* renamed from: b, reason: collision with root package name */
        public static final a f18647b = new C0379a(Date.class);

        /* renamed from: a, reason: collision with root package name */
        private final Class f18648a;

        /* renamed from: com.google.gson.internal.bind.DefaultDateTypeAdapter$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        class C0379a extends a {
            C0379a(Class cls) {
                super(cls);
            }

            @Override // com.google.gson.internal.bind.DefaultDateTypeAdapter.a
            protected Date a(Date date) {
                return date;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(Class cls) {
            this.f18648a = cls;
        }

        protected abstract Date a(Date date);
    }

    private Date e(C3990a c3990a) {
        String L8 = c3990a.L();
        synchronized (this.f18646b) {
            try {
                Iterator it = this.f18646b.iterator();
                while (it.hasNext()) {
                    try {
                        return ((DateFormat) it.next()).parse(L8);
                    } catch (ParseException unused) {
                    }
                }
                try {
                    return AbstractC3829a.c(L8, new ParsePosition(0));
                } catch (ParseException e8) {
                    throw new m("Failed parsing '" + L8 + "' as Date; at path " + c3990a.u(), e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public Date b(C3990a c3990a) {
        if (c3990a.N() == EnumC3991b.NULL) {
            c3990a.J();
            return null;
        }
        return this.f18645a.a(e(c3990a));
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.A();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f18646b.get(0);
        synchronized (this.f18646b) {
            format = dateFormat.format(date);
        }
        cVar.Q(format);
    }

    public String toString() {
        DateFormat dateFormat = (DateFormat) this.f18646b.get(0);
        if (dateFormat instanceof SimpleDateFormat) {
            return "DefaultDateTypeAdapter(" + ((SimpleDateFormat) dateFormat).toPattern() + ')';
        }
        return "DefaultDateTypeAdapter(" + dateFormat.getClass().getSimpleName() + ')';
    }
}
