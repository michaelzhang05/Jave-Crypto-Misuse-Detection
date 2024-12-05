package k6;

import com.mbridge.msdk.c.h;
import kotlin.jvm.internal.AbstractC3255y;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: k6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC3230f extends AbstractC3229e {
    public static final EnumC3228d d(char c8, boolean z8) {
        if (!z8) {
            if (c8 == 'D') {
                return EnumC3228d.f34144h;
            }
            throw new IllegalArgumentException("Invalid or unsupported duration ISO non-time unit: " + c8);
        }
        if (c8 == 'H') {
            return EnumC3228d.f34143g;
        }
        if (c8 == 'M') {
            return EnumC3228d.f34142f;
        }
        if (c8 == 'S') {
            return EnumC3228d.f34141e;
        }
        throw new IllegalArgumentException("Invalid duration ISO time unit: " + c8);
    }

    public static final EnumC3228d e(String shortName) {
        AbstractC3255y.i(shortName, "shortName");
        int hashCode = shortName.hashCode();
        if (hashCode != 100) {
            if (hashCode != 104) {
                if (hashCode != 109) {
                    if (hashCode != 115) {
                        if (hashCode != 3494) {
                            if (hashCode != 3525) {
                                if (hashCode == 3742 && shortName.equals("us")) {
                                    return EnumC3228d.f34139c;
                                }
                            } else if (shortName.equals("ns")) {
                                return EnumC3228d.f34138b;
                            }
                        } else if (shortName.equals("ms")) {
                            return EnumC3228d.f34140d;
                        }
                    } else if (shortName.equals("s")) {
                        return EnumC3228d.f34141e;
                    }
                } else if (shortName.equals("m")) {
                    return EnumC3228d.f34142f;
                }
            } else if (shortName.equals(h.f19072a)) {
                return EnumC3228d.f34143g;
            }
        } else if (shortName.equals("d")) {
            return EnumC3228d.f34144h;
        }
        throw new IllegalArgumentException("Unknown duration unit short name: " + shortName);
    }
}
