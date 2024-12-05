package com.google.crypto.tink.shaded.protobuf;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public abstract class h1 {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f5497a;

        a(h hVar) {
            this.f5497a = hVar;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h1.b
        public byte a(int i6) {
            return this.f5497a.i(i6);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.h1.b
        public int size() {
            return this.f5497a.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: classes.dex */
    public interface b {
        byte a(int i6);

        int size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(h hVar) {
        return b(new a(hVar));
    }

    static String b(b bVar) {
        String str;
        StringBuilder sb = new StringBuilder(bVar.size());
        for (int i6 = 0; i6 < bVar.size(); i6++) {
            int a6 = bVar.a(i6);
            if (a6 == 34) {
                str = "\\\"";
            } else if (a6 == 39) {
                str = "\\'";
            } else if (a6 != 92) {
                switch (a6) {
                    case 7:
                        str = "\\a";
                        break;
                    case 8:
                        str = "\\b";
                        break;
                    case 9:
                        str = "\\t";
                        break;
                    case 10:
                        str = "\\n";
                        break;
                    case 11:
                        str = "\\v";
                        break;
                    case 12:
                        str = "\\f";
                        break;
                    case 13:
                        str = "\\r";
                        break;
                    default:
                        if (a6 < 32 || a6 > 126) {
                            sb.append('\\');
                            sb.append((char) (((a6 >>> 6) & 3) + 48));
                            sb.append((char) (((a6 >>> 3) & 7) + 48));
                            a6 = (a6 & 7) + 48;
                        }
                        sb.append((char) a6);
                        continue;
                }
            } else {
                str = "\\\\";
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String c(String str) {
        return a(h.n(str));
    }
}
