package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* loaded from: classes.dex */
class s {

    /* renamed from: c, reason: collision with root package name */
    private static final s f5017c = new s(null, null);

    /* renamed from: a, reason: collision with root package name */
    private final Long f5018a;

    /* renamed from: b, reason: collision with root package name */
    private final TimeZone f5019b;

    private s(Long l6, TimeZone timeZone) {
        this.f5018a = l6;
        this.f5019b = timeZone;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static s c() {
        return f5017c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public Calendar a() {
        return b(this.f5019b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l6 = this.f5018a;
        if (l6 != null) {
            calendar.setTimeInMillis(l6.longValue());
        }
        return calendar;
    }
}
