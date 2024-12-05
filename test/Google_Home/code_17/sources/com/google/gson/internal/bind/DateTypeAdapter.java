package com.google.gson.internal.bind;

import com.google.gson.Gson;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.d;
import com.google.gson.internal.i;
import com.google.gson.m;
import com.google.gson.r;
import com.google.gson.reflect.TypeToken;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import q1.AbstractC3829a;
import s1.C3990a;
import s1.EnumC3991b;
import s1.c;

/* loaded from: classes4.dex */
public final class DateTypeAdapter extends TypeAdapter {

    /* renamed from: b, reason: collision with root package name */
    public static final r f18643b = new r() { // from class: com.google.gson.internal.bind.DateTypeAdapter.1
        @Override // com.google.gson.r
        public TypeAdapter a(Gson gson, TypeToken typeToken) {
            if (typeToken.c() == Date.class) {
                return new DateTypeAdapter();
            }
            return null;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final List f18644a;

    public DateTypeAdapter() {
        ArrayList arrayList = new ArrayList();
        this.f18644a = arrayList;
        Locale locale = Locale.US;
        arrayList.add(DateFormat.getDateTimeInstance(2, 2, locale));
        if (!Locale.getDefault().equals(locale)) {
            arrayList.add(DateFormat.getDateTimeInstance(2, 2));
        }
        if (d.d()) {
            arrayList.add(i.c(2, 2));
        }
    }

    private Date e(C3990a c3990a) {
        String L8 = c3990a.L();
        synchronized (this.f18644a) {
            try {
                Iterator it = this.f18644a.iterator();
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
        return e(c3990a);
    }

    @Override // com.google.gson.TypeAdapter
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public void d(c cVar, Date date) {
        String format;
        if (date == null) {
            cVar.A();
            return;
        }
        DateFormat dateFormat = (DateFormat) this.f18644a.get(0);
        synchronized (this.f18644a) {
            format = dateFormat.format(date);
        }
        cVar.Q(format);
    }
}
