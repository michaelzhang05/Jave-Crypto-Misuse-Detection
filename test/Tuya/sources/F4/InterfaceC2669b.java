package f4;

import L5.I;
import P5.d;
import android.content.Context;
import com.google.android.libraries.places.R;
import com.google.android.libraries.places.api.Places;
import com.google.android.libraries.places.api.net.PlacesClient;
import k3.i;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;
import m4.C3432w;

/* renamed from: f4.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC2669b {

    /* renamed from: a, reason: collision with root package name */
    public static final a f31109a = a.f31110a;

    /* renamed from: f4.b$a */
    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f31110a = new a();

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f4.b$a$a, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0743a extends AbstractC3160z implements Function1 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f31111a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0743a(Context context) {
                super(1);
                this.f31111a = context;
            }

            @Override // kotlin.jvm.functions.Function1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final PlacesClient invoke(Context it) {
                AbstractC3159y.i(it, "it");
                PlacesClient createClient = Places.createClient(this.f31111a);
                AbstractC3159y.h(createClient, "createClient(...)");
                return createClient;
            }
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: f4.b$a$b, reason: collision with other inner class name */
        /* loaded from: classes4.dex */
        public static final class C0744b extends AbstractC3160z implements Function0 {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ Context f31112a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ String f31113b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0744b(Context context, String str) {
                super(0);
                this.f31112a = context;
                this.f31113b = str;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m5585invoke();
                return I.f6487a;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m5585invoke() {
                Places.initialize(this.f31112a, this.f31113b);
            }
        }

        private a() {
        }

        public static /* synthetic */ InterfaceC2669b b(a aVar, Context context, String str, m4.I i8, Function1 function1, Function0 function0, i iVar, int i9, Object obj) {
            if ((i9 & 4) != 0) {
                i8 = new C3432w();
            }
            m4.I i10 = i8;
            if ((i9 & 8) != 0) {
                function1 = new C0743a(context);
            }
            Function1 function12 = function1;
            if ((i9 & 16) != 0) {
                function0 = new C0744b(context, str);
            }
            return aVar.a(context, str, i10, function12, function0, iVar);
        }

        public static /* synthetic */ Integer d(a aVar, boolean z8, m4.I i8, int i9, Object obj) {
            if ((i9 & 2) != 0) {
                i8 = new C3432w();
            }
            return aVar.c(z8, i8);
        }

        public final InterfaceC2669b a(Context context, String googlePlacesApiKey, m4.I isPlacesAvailable, Function1 clientFactory, Function0 initializer, i errorReporter) {
            AbstractC3159y.i(context, "context");
            AbstractC3159y.i(googlePlacesApiKey, "googlePlacesApiKey");
            AbstractC3159y.i(isPlacesAvailable, "isPlacesAvailable");
            AbstractC3159y.i(clientFactory, "clientFactory");
            AbstractC3159y.i(initializer, "initializer");
            AbstractC3159y.i(errorReporter, "errorReporter");
            if (isPlacesAvailable.invoke()) {
                initializer.invoke();
                return new C2668a((PlacesClient) clientFactory.invoke(context), errorReporter);
            }
            return new C2670c(errorReporter);
        }

        public final Integer c(boolean z8, m4.I isPlacesAvailable) {
            int i8;
            AbstractC3159y.i(isPlacesAvailable, "isPlacesAvailable");
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
