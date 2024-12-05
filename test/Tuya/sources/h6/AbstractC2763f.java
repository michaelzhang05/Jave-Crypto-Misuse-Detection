package h6;

import com.mbridge.msdk.c.h;
import kotlin.jvm.internal.AbstractC3159y;

/* renamed from: h6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
abstract class AbstractC2763f extends AbstractC2762e {
    public static final EnumC2761d d(char c8, boolean z8) {
        if (!z8) {
            if (c8 == 'D') {
                return EnumC2761d.f31422h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c8);
        }
        if (c8 == 'H') {
            return EnumC2761d.f31421g;
        }
        if (c8 == 'M') {
            return EnumC2761d.f31420f;
        }
        if (c8 == 'S') {
            return EnumC2761d.f31419e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c8);
    }

    public static final EnumC2761d e(String shortName) {
        AbstractC3159y.i(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return EnumC2761d.f31417c;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC2761d.f31416b;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC2761d.f31418d;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC2761d.f31419e;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC2761d.f31420f;
                }
            } else if (shortName.equals(h.f18017a)) {
                return EnumC2761d.f31421g;
            }
        } else if (shortName.equals("d")) {
            return EnumC2761d.f31422h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
