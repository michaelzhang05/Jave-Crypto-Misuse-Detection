package androidx.media;

import androidx.versionedparcelable.VersionedParcel;

/* loaded from: classes.dex */
public final class AudioAttributesImplBaseParcelizer {
    public static AudioAttributesImplBase read(VersionedParcel versionedParcel) {
        AudioAttributesImplBase audioAttributesImplBase = new AudioAttributesImplBase();
        audioAttributesImplBase.a = versionedParcel.p(audioAttributesImplBase.a, 1);
        audioAttributesImplBase.f1284b = versionedParcel.p(audioAttributesImplBase.f1284b, 2);
        audioAttributesImplBase.f1285c = versionedParcel.p(audioAttributesImplBase.f1285c, 3);
        audioAttributesImplBase.f1286d = versionedParcel.p(audioAttributesImplBase.f1286d, 4);
        return audioAttributesImplBase;
    }

    public static void write(AudioAttributesImplBase audioAttributesImplBase, VersionedParcel versionedParcel) {
        versionedParcel.x(false, false);
        versionedParcel.F(audioAttributesImplBase.a, 1);
        versionedParcel.F(audioAttributesImplBase.f1284b, 2);
        versionedParcel.F(audioAttributesImplBase.f1285c, 3);
        versionedParcel.F(audioAttributesImplBase.f1286d, 4);
    }
}
