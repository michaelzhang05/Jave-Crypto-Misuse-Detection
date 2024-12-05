package com.google.android.gms.internal.measurement;

import java.io.IOException;

/* loaded from: classes3.dex */
public class D4 extends IOException {
    public D4(String str) {
        super(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static C4 a() {
        return new C4("Protocol message tag had invalid wire type.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D4 b() {
        return new D4("Protocol message contained an invalid tag (zero).");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D4 c() {
        return new D4("Protocol message had invalid UTF-8.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D4 d() {
        return new D4("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D4 e() {
        return new D4("Failed to parse the message.");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static D4 f() {
        return new D4("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }
}
