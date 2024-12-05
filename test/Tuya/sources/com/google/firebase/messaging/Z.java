package com.google.firebase.messaging;

import R.AbstractC1317n;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes3.dex */
final class Z {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f17398d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f17399a;

    /* renamed from: b, reason: collision with root package name */
    private final String f17400b;

    /* renamed from: c, reason: collision with root package name */
    private final String f17401c;

    private Z(String str, String str2) {
        this.f17399a = d(str2, str);
        this.f17400b = str;
        this.f17401c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Z a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new Z(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f17398d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String b() {
        return this.f17400b;
    }

    public String c() {
        return this.f17399a;
    }

    public String e() {
        return this.f17401c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z8 = (Z) obj;
        if (!this.f17399a.equals(z8.f17399a) || !this.f17400b.equals(z8.f17400b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC1317n.b(this.f17400b, this.f17399a);
    }
}
