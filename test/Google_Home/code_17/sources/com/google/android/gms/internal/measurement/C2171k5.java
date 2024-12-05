package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* renamed from: com.google.android.gms.internal.measurement.k5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C2171k5 extends IOException {
    public C2171k5(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2198n5 a() {
        return new C2198n5("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2171k5 b() {
        return new C2171k5("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2171k5 c() {
        return new C2171k5("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2171k5 d() {
        return new C2171k5("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2171k5 e() {
        return new C2171k5("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2171k5 f() {
        return new C2171k5("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C2171k5 g() {
        return new C2171k5("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
