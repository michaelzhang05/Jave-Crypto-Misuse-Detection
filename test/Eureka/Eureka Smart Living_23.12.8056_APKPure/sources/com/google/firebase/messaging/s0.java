package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes.dex */
public final class s0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    private final int f5980a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s0(String str) {
        super(str);
        this.f5980a = a(str);
    }

    private int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.hashCode();
        char c6 = 65535;
        switch (lowerCase.hashCode()) {
            case -1743242157:
                if (lowerCase.equals("service_not_available")) {
                    c6 = 0;
                    break;
                }
                break;
            case -1290953729:
                if (lowerCase.equals("toomanymessages")) {
                    c6 = 1;
                    break;
                }
                break;
            case -920906446:
                if (lowerCase.equals("invalid_parameters")) {
                    c6 = 2;
                    break;
                }
                break;
            case -617027085:
                if (lowerCase.equals("messagetoobig")) {
                    c6 = 3;
                    break;
                }
                break;
            case -95047692:
                if (lowerCase.equals("missing_to")) {
                    c6 = 4;
                    break;
                }
                break;
        }
        switch (c6) {
            case 0:
                return 3;
            case 1:
                return 4;
            case 2:
            case 4:
                return 1;
            case 3:
                return 2;
            default:
                return 0;
        }
    }
}
