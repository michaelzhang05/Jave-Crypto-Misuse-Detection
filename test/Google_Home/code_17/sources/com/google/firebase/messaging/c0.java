package com.google.firebase.messaging;

import Q.AbstractC1398n;
import android.text.TextUtils;
import android.util.Log;
import java.util.regex.Pattern;

/* loaded from: classes4.dex */
final class c0 {

    /* renamed from: d, reason: collision with root package name */
    private static final Pattern f18458d = Pattern.compile("[a-zA-Z0-9-_.~%]{1,900}");

    /* renamed from: a, reason: collision with root package name */
    private final String f18459a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18460b;

    /* renamed from: c, reason: collision with root package name */
    private final String f18461c;

    private c0(String str, String str2) {
        this.f18459a = d(str2, str);
        this.f18460b = str;
        this.f18461c = str + "!" + str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static c0 a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        String[] split = str.split("!", -1);
        if (split.length != 2) {
            return null;
        }
        return new c0(split[0], split[1]);
    }

    private static String d(String str, String str2) {
        if (str != null && str.startsWith("/topics/")) {
            Log.w("FirebaseMessaging", String.format("Format /topics/topic-name is deprecated. Only 'topic-name' should be used in %s.", str2));
            str = str.substring(8);
        }
        if (str != null && f18458d.matcher(str).matches()) {
            return str;
        }
        throw new IllegalArgumentException(String.format("Invalid topic name: %s does not match the allowed format %s.", str, "[a-zA-Z0-9-_.~%]{1,900}"));
    }

    public String b() {
        return this.f18460b;
    }

    public String c() {
        return this.f18459a;
    }

    public String e() {
        return this.f18461c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        if (!this.f18459a.equals(c0Var.f18459a) || !this.f18460b.equals(c0Var.f18460b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return AbstractC1398n.b(this.f18460b, this.f18459a);
    }
}
