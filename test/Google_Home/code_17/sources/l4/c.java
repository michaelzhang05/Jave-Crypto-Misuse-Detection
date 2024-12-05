package L4;

import M4.i;
import O5.I;
import O5.t;
import Q4.f;
import S5.d;
import a6.InterfaceC1668n;
import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.documentfile.provider.DocumentFile;
import j6.n;
import java.io.File;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.AbstractC3255y;
import l6.AbstractC3360i;
import l6.AbstractC3364k;
import l6.C3347b0;
import l6.J0;
import l6.M;
import l6.N;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final DocumentFile f6264a;

    /* renamed from: b, reason: collision with root package name */
    private final File f6265b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f6266c;

    /* renamed from: d, reason: collision with root package name */
    private final i f6267d;

    /* loaded from: classes5.dex */
    static final class a extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6268a;

        a(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new a(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6268a;
            if (i8 != 0) {
                if (i8 == 1) {
                    t.b(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                t.b(obj);
                c cVar = c.this;
                this.f6268a = 1;
                if (cVar.f(this) == e8) {
                    return e8;
                }
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes5.dex */
    public static final class b extends l implements InterfaceC1668n {

        /* renamed from: a, reason: collision with root package name */
        int f6270a;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* loaded from: classes5.dex */
        public static final class a extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6272a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f6273b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f6274c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c cVar, ArrayList arrayList, d dVar) {
                super(2, dVar);
                this.f6273b = cVar;
                this.f6274c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new a(this.f6273b, this.f6274c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6272a == 0) {
                    t.b(obj);
                    this.f6273b.f6267d.a(this.f6274c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((a) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: L4.c$b$b, reason: collision with other inner class name */
        /* loaded from: classes5.dex */
        public static final class C0113b extends l implements InterfaceC1668n {

            /* renamed from: a, reason: collision with root package name */
            int f6275a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ c f6276b;

            /* renamed from: c, reason: collision with root package name */
            final /* synthetic */ ArrayList f6277c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0113b(c cVar, ArrayList arrayList, d dVar) {
                super(2, dVar);
                this.f6276b = cVar;
                this.f6277c = arrayList;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final d create(Object obj, d dVar) {
                return new C0113b(this.f6276b, this.f6277c, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                T5.b.e();
                if (this.f6275a == 0) {
                    t.b(obj);
                    this.f6276b.f6267d.b(this.f6277c);
                    return I.f8278a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }

            @Override // a6.InterfaceC1668n
            public final Object invoke(M m8, d dVar) {
                return ((C0113b) create(m8, dVar)).invokeSuspend(I.f8278a);
            }
        }

        b(d dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d create(Object obj, d dVar) {
            return new b(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object e8 = T5.b.e();
            int i8 = this.f6270a;
            try {
                if (i8 != 0) {
                    if (i8 == 1 || i8 == 2) {
                        t.b(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    t.b(obj);
                    int i9 = 0;
                    if (c.this.f6264a != null) {
                        DocumentFile[] listFiles = c.this.f6264a.listFiles();
                        AbstractC3255y.h(listFiles, "currentDirectory.listFiles()");
                        ArrayList arrayList = new ArrayList();
                        int length = listFiles.length;
                        while (i9 < length) {
                            DocumentFile documentFile = listFiles[i9];
                            if (documentFile.getName() != null) {
                                arrayList.add(documentFile);
                                String path = documentFile.getUri().getPath();
                                if (path != null) {
                                    c cVar = c.this;
                                    String name = documentFile.getName();
                                    AbstractC3255y.f(name);
                                    cVar.g(path, name);
                                }
                            }
                            i9++;
                        }
                        J0 c8 = C3347b0.c();
                        a aVar = new a(c.this, arrayList, null);
                        this.f6270a = 1;
                        if (AbstractC3360i.g(c8, aVar, this) == e8) {
                            return e8;
                        }
                    } else if (c.this.f6265b != null) {
                        File[] listFiles2 = c.this.f6265b.listFiles();
                        ArrayList arrayList2 = new ArrayList();
                        if (listFiles2 != null) {
                            int length2 = listFiles2.length;
                            while (i9 < length2) {
                                File file = listFiles2[i9];
                                arrayList2.add(file);
                                c cVar2 = c.this;
                                String path2 = file.getPath();
                                AbstractC3255y.h(path2, "file.path");
                                String name2 = file.getName();
                                AbstractC3255y.h(name2, "file.name");
                                cVar2.g(path2, name2);
                                i9++;
                            }
                        }
                        J0 c9 = C3347b0.c();
                        C0113b c0113b = new C0113b(c.this, arrayList2, null);
                        this.f6270a = 2;
                        if (AbstractC3360i.g(c9, c0113b, this) == e8) {
                            return e8;
                        }
                    }
                }
            } catch (Error e9) {
                e9.printStackTrace();
            } catch (Exception e10) {
                e10.printStackTrace();
            }
            return I.f8278a;
        }

        @Override // a6.InterfaceC1668n
        public final Object invoke(M m8, d dVar) {
            return ((b) create(m8, dVar)).invokeSuspend(I.f8278a);
        }
    }

    public c(DocumentFile documentFile, File file, Context context, i listener) {
        AbstractC3255y.i(context, "context");
        AbstractC3255y.i(listener, "listener");
        this.f6264a = documentFile;
        this.f6265b = file;
        this.f6266c = context;
        this.f6267d = listener;
        AbstractC3364k.d(N.a(C3347b0.b()), null, null, new a(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object f(d dVar) {
        Object g8 = AbstractC3360i.g(C3347b0.b(), new b(null), dVar);
        if (g8 == T5.b.e()) {
            return g8;
        }
        return I.f8278a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(String str, String str2) {
        Drawable h8;
        if (n.r(str2, ".apk", false, 2, null)) {
            Q4.t tVar = Q4.t.f9230a;
            if (!tVar.a().containsKey(str2) && (h8 = new f().h(this.f6266c, str)) != null) {
                tVar.a().put(str2, h8);
            }
        }
    }
}
