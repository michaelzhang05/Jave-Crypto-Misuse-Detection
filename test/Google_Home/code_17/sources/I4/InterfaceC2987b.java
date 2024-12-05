package i4;

import O5.I;
import S5.d;
import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;
import n3.i;
import p4.C3775w;

/* renamed from: i4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2987b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f32972a = a.f32973a;

    /* renamed from: i4.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f32973a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0769a extends AbstractC3256z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f32974a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0769a(Context context) {
                super(1);
                this.f32974a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlacesClient invoke(Context it) {
                AbstractC3255y.i(it, "it");
                PlacesClient createClient = Places.createClient(this.f32974a);
                AbstractC3255y.h(createClient, "createClient(...)");
                return createClient;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: i4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0770b extends AbstractC3256z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f32975a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f32976b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0770b(Context context, String str) {
                super(0);
                this.f32975a = context;
                this.f32976b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5589invoke();
                return I.f8278a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5589invoke() {
                Places.initialize(this.f32975a, this.f32976b);
            }
        }

        private a() {
        }

        public static /* synthetic */ InterfaceC2987b b(a aVar, Context context, String str, p4.I i8, Function1 function1, Function0 function0, i iVar, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                i8 = new C3775w();
            }
            p4.I i10 = i8;
            if ((i9 & 8) != 0) {
                function1 = new C0769a(context);
            }
            Function1 function12 = function1;
            if ((i9 & 16) != 0) {
                function0 = new C0770b(context, str);
            }
            return aVar.a(context, str, i10, function12, function0, iVar);
        }

        public static /* synthetic */ Integer d(a aVar, boolean z8, p4.I i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = new C3775w();
            }
            return aVar.c(z8, i8);
        }

        public final InterfaceC2987b a(Context context, String googlePlacesApiKey, p4.I isPlacesAvailable, Function1 clientFactory, Function0 initializer, i errorReporter) {
            AbstractC3255y.i(context, "context");
            AbstractC3255y.i(googlePlacesApiKey, "googlePlacesApiKey");
            AbstractC3255y.i(isPlacesAvailable, "isPlacesAvailable");
            AbstractC3255y.i(clientFactory, "clientFactory");
            AbstractC3255y.i(initializer, "initializer");
            AbstractC3255y.i(errorReporter, "errorReporter");
            if (isPlacesAvailable.invoke()) {
                initializer.invoke();
                return new C2986a((PlacesClient) clientFactory.invoke(context), errorReporter);
            }
            return new C2988c(errorReporter);
        }

        public final Integer c(boolean z8, p4.I isPlacesAvailable) {
            int i8;
            AbstractC3255y.i(isPlacesAvailable, "isPlacesAvailable");
            if (isPlacesAvailable.invoke()) {
                if (z8) {
                    i8 = R.drawable.places_powered_by_google_dark;
                } else {
                    i8 = R.drawable.places_powered_by_google_light;
                }
                return Integer.valueOf(i8);
            }
            return null;
        }
    }

    Object a(String str, d dVar);

    Object b(String str, String str2, int i8, d dVar);
}
