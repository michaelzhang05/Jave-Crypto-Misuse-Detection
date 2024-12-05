package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* compiled from: TimeSource.java */
/* loaded from: classes2.dex */
class l {
    private static final l a = new l(null, null);

    /* renamed from: b, reason: collision with root package name */
    private final Long f16601b;

    /* renamed from: c, reason: collision with root package name */
    private final TimeZone f16602c;

    private l(Long l, TimeZone timeZone) {
        this.f16601b = l;
        this.f16602c = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static l c() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f16602c);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l = this.f16601b;
        if (l != null) {
            calendar.setTimeInMillis(l.longValue());
        }
        return calendar;
    }
}
