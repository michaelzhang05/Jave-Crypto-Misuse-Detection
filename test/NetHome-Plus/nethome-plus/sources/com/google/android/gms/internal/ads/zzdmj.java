package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdmi;
import com.google.android.gms.internal.ads.zzdmj;
import java.io.IOException;

/* loaded from: classes2.dex */
public abstract class zzdmj<MessageType extends zzdmi<MessageType, BuilderType>, BuilderType extends zzdmj<MessageType, BuilderType>> implements zzdpl {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.zzdpl
    public final /* synthetic */ zzdpl Y(zzdpk zzdpkVar) {
        if (e().getClass().isInstance(zzdpkVar)) {
            return j((zzdmi) zzdpkVar);
        }
        throw new IllegalArgumentException("mergeFrom(MessageLite) can only merge messages of the same type.");
    }

    protected abstract BuilderType j(MessageType messagetype);

    public abstract BuilderType k(zzdnd zzdndVar, zzdno zzdnoVar) throws IOException;

    public BuilderType l(byte[] bArr, int i2, int i3, zzdno zzdnoVar) throws zzdok {
        try {
            zzdnd v = zzdnd.v(bArr, 0, i3, false);
            k(v, zzdnoVar);
            v.x(0);
            return this;
        } catch (zzdok e2) {
            throw e2;
        } catch (IOException e3) {
            String name = getClass().getName();
            StringBuilder sb = new StringBuilder(name.length() + 60 + "byte array".length());
            sb.append("Reading ");
            sb.append(name);
            sb.append(" from a ");
            sb.append("byte array");
            sb.append(" threw an IOException (should never happen).");
            throw new RuntimeException(sb.toString(), e3);
        }
    }

    @Override // 
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public abstract BuilderType clone();
}
