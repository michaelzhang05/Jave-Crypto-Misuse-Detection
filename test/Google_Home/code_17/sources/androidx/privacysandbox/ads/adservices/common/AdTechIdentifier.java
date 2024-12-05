package androidx.privacysandbox.ads.adservices.common;

import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class AdTechIdentifier {
    private final String identifier;

    public AdTechIdentifier(String identifier) {
        AbstractC3255y.i(identifier, "identifier");
        this.identifier = identifier;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdTechIdentifier)) {
            return false;
        }
        return AbstractC3255y.d(this.identifier, ((AdTechIdentifier) obj).identifier);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public int hashCode() {
        return this.identifier.hashCode();
    }

    public String toString() {
        return String.valueOf(this.identifier);
    }
}
