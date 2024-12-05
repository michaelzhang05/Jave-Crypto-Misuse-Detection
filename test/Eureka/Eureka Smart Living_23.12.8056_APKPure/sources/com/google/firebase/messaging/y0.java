package com.google.firebase.messaging;

import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
final class y0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f6015d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f6016a;

    /* renamed from: b, reason: collision with root package name */
    private final String f6017b;

    /* renamed from: c, reason: collision with root package name */
    private final String f6018c;

    private y0(String str, String str2) {
        this.f6016a = d(str2, str);
        this.f6017b = str;
        this.f6018c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static y0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new y0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str == null || !f6015d.matcher(str).matches()) {
            throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
        }
        return str;
    }

    public String b() {
        return this.f6017b;
    }

    public String c() {
        return this.f6016a;
    }

    public String e() {
        return this.f6018c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof y0)) {
            return false;
        }
        y0 y0Var = (y0) obj;
        return this.f6016a.equals(y0Var.f6016a) && this.f6017b.equals(y0Var.f6017b);
    }

    public int hashCode() {
        return v1.m.b(this.f6017b, this.f6016a);
    }
}
