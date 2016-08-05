package com.tokopedia.tokopediaapitest;

import android.app.Instrumentation;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.squareup.okhttp.mockwebserver.MockResponse;
import com.tokopedia.tokopediaapitest.component.RestApiComponent;

import static android.support.test.espresso.Espresso.*;
import static android.support.test.espresso.matcher.ViewMatchers.*;
import static android.support.test.espresso.action.ViewActions.*;
import static android.support.test.espresso.assertion.ViewAssertions.*;
import static org.hamcrest.core.StringContains.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import javax.inject.Singleton;

import dagger.Component;
import retrofit2.Retrofit;

/**
 * Created by Erry on 8/4/2016.
 */

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Inject
    Retrofit retrofit;

    @Singleton
    @Component(modules = MockRestApiModule.class)
    public interface TestComponent extends RestApiComponent {
        void inject(MainActivityTest activity);
    }

    @Rule
    public ActivityTestRule<MainActivity> activityTestRule = new ActivityTestRule<>(MainActivity.class);

    MockRestApiModule mockRestApiModule;

    @Before
    public void setUp(){
        Instrumentation instrumentation = InstrumentationRegistry.getInstrumentation();
        AppAplication aplication = (AppAplication) instrumentation.getTargetContext().getApplicationContext();
        mockRestApiModule = new MockRestApiModule();
        TestComponent testComponent = DaggerMainActivityTest_TestComponent.builder().mockRestApiModule(mockRestApiModule).build();
        aplication.setComponent(testComponent);
        testComponent.inject(this);
    }

    @After
    public void tearDown(){
        mockRestApiModule.stopServer();
    }

    @Test
    public void testSearchProduct() throws InterruptedException {
        String body = "{\"status\":{\"error_code\":0,\"message\":\"OK\"},\"data\":[{\"id\":54557581,\"name\":\"Sarung Toya' Rotan /Tas Toya dan /Sarung Golok\",\"uri\":\"https://www.tokopedia.com/kiosterate/sarung-toya-rotan-tas-toya-dan-sarung-golok\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/8/3/977827/977827_bd89789e-3644-4867-b3ed-dcbf1172aab9.jpg\",\"price\":\"Rp 60.000\",\"shop\":{\"id\":977827,\"name\":\"KIOS TERATE\",\"uri\":\"https://www.tokopedia.com/kiosterate\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":5,\"service\":0,\"reputation_score\":90,\"reputation_set\":1,\"reputation_level\":4},\"location\":\"Pasuruan\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-4-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=977827\",\"domain\":\"\"},\"wholesale_price\":[{\"count_min\":2,\"count_max\":10,\"price\":\"Rp 55.000\"}],\"condition\":1,\"preorder\":0,\"department_id\":1503,\"labels\":[{\"title\":\"WholeSale\",\"color\":\"#44a9ec\"}],\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=977827\"}]},{\"id\":24055100,\"name\":\"BARBERS Pomade\",\"uri\":\"https://www.tokopedia.com/essentialsid/barbers-pomade-1\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2015/11/16/5002350/5002350_29d2e122-8fe5-4f55-8745-fd1391917cb6.jpg\",\"price\":\"Rp 135.000\",\"shop\":{\"id\":597864,\"name\":\"essentialsID\",\"uri\":\"https://www.tokopedia.com/essentialsid\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":5,\"service\":0,\"reputation_score\":22,\"reputation_set\":1,\"reputation_level\":2},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-2-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=597864\",\"domain\":\"\"},\"wholesale_price\":[{\"count_min\":6,\"count_max\":11,\"price\":\"Rp 130.000\"},{\"count_min\":12,\"count_max\":23,\"price\":\"Rp 128.250\"},{\"count_min\":24,\"count_max\":47,\"price\":\"Rp 121.500\"},{\"count_min\":48,\"count_max\":71,\"price\":\"Rp 118.125\"}],\"condition\":1,\"preorder\":0,\"department_id\":438,\"labels\":[{\"title\":\"WholeSale\",\"color\":\"#44a9ec\"}],\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=597864\"}]},{\"id\":53009005,\"name\":\"nomor cantik perdana XL\",\"uri\":\"https://www.tokopedia.com/felavadi7/nomor-cantik-perdana-xl-3\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/7/26/1124788/1124788_0c33467c-0e38-45a9-9435-83935faae95a.jpg\",\"price\":\"Rp 35.000\",\"shop\":{\"id\":1124788,\"name\":\"Felavadi7\",\"uri\":\"https://www.tokopedia.com/felavadi7\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":4,\"service\":0,\"reputation_score\":20,\"reputation_set\":1,\"reputation_level\":2},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-2-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=1124788\",\"domain\":\"\"},\"condition\":1,\"preorder\":0,\"department_id\":275,\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=1124788\"}]},{\"id\":45536748,\"name\":\"Tas Selempang Punggung Kanvas HItam\",\"uri\":\"https://www.tokopedia.com/sepatukerjakulit/tas-selempang-punggung-kanvas-hitam\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/5/26/4262989/4262989_ff3403c2-506b-41a2-8f82-83640f118169.jpg\",\"price\":\"Rp 185.000\",\"shop\":{\"id\":513992,\"name\":\"sepatu kerja kulit asli\",\"uri\":\"https://www.tokopedia.com/sepatukerjakulit\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":4,\"service\":0,\"reputation_score\":57,\"reputation_set\":1,\"reputation_level\":4},\"location\":\"Surabaya\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-4-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=513992\",\"domain\":\"\"},\"condition\":1,\"preorder\":0,\"department_id\":211,\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=513992\"}]},{\"id\":50563954,\"name\":\"Bunga plastik/artificial mawar pink merah\",\"uri\":\"https://www.tokopedia.com/edberflowershop/bunga-plastikartificial-mawar-pink-merah\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/7/7/50563954/50563954_d13220dd-7b3f-488a-8a9b-84782a4cb0a1.jpg\",\"price\":\"Rp 285.000\",\"shop\":{\"id\":1207198,\"name\":\"EDBERT FLOWER SHOP\",\"uri\":\"https://www.tokopedia.com/edberflowershop\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":5,\"service\":0,\"reputation_score\":4,\"reputation_set\":0,\"reputation_level\":0},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/badges-off.jpg\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=1207198\",\"domain\":\"\"},\"condition\":1,\"preorder\":0,\"department_id\":1271,\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=1207198\"}]},{\"id\":41918708,\"name\":\"NEW UNIC UC46 projector wifi 1200 lumens proyektor bukan uc40 ORIGINAL\",\"uri\":\"https://www.tokopedia.com/grupway/new-unic-uc46-projector-wifi-1200-lumens-proyektor-bukan-uc40-original\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/4/29/4481336/4481336_cad57ce9-dc1d-48b0-a7eb-337c526e0070.jpg\",\"price\":\"Rp 940.000\",\"shop\":{\"id\":536993,\"name\":\"Grupway Gadget\",\"uri\":\"https://www.tokopedia.com/grupway\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":5,\"service\":0,\"reputation_score\":298,\"reputation_set\":2,\"reputation_level\":1},\"location\":\"Tangerang\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/silver-1-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=536993\",\"domain\":\"\"},\"condition\":1,\"preorder\":0,\"department_id\":374,\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=536993\"}]},{\"id\":24234759,\"name\":\"Khimar, Hijab Instan, Jilbab Instan, Jilbab Instant Khimar Arabian\",\"uri\":\"https://www.tokopedia.com/tokopreview/khimar-hijab-instan-jilbab-instan-jilbab-instant-khimar-arabian\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2015/11/18/4730682/4730682_ebb59a6e-dad1-47fc-8161-0ec0fae4bec4.jpg\",\"price\":\"Rp 59.000\",\"shop\":{\"id\":560112,\"name\":\"TokoPreview,com\",\"uri\":\"https://www.tokopedia.com/tokopreview\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":4,\"service\":0,\"reputation_score\":35,\"reputation_set\":1,\"reputation_level\":2},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-2-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=560112\",\"domain\":\"\"},\"wholesale_price\":[{\"count_min\":5,\"count_max\":5,\"price\":\"Rp 53.000\"}],\"condition\":1,\"preorder\":0,\"department_id\":188,\"labels\":[{\"title\":\"WholeSale\",\"color\":\"#44a9ec\"}],\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=560112\"}]},{\"id\":39937346,\"name\":\"MY LITTLE PONY BIRU\",\"uri\":\"https://www.tokopedia.com/f-vblossom/my-little-pony-biru\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/4/14/521078/521078_9732c984-c054-456c-9243-b746d4f91920.jpg\",\"price\":\"Rp 35.000\",\"shop\":{\"id\":521078,\"name\":\"F&amp;V BLOSSOM\",\"uri\":\"https://www.tokopedia.com/f-vblossom\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":5,\"service\":0,\"reputation_score\":25,\"reputation_set\":1,\"reputation_level\":2},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-2-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=521078\",\"domain\":\"\"},\"condition\":1,\"preorder\":0,\"department_id\":211,\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=521078\"}]},{\"id\":41528880,\"name\":\"PRODUK TERBARU Sepatu Wanita flat bella\",\"uri\":\"https://www.tokopedia.com/dreamtheater/produk-terbaru-sepatu-wanita-flat-bella\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/4/26/8851260/8851260_8fef6f67-547b-49c8-9b62-8250886c508f.jpg\",\"price\":\"Rp 142.500\",\"shop\":{\"id\":1070034,\"name\":\"Dream Theater\",\"uri\":\"https://www.tokopedia.com/dreamtheater\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":4,\"service\":0,\"reputation_score\":10,\"reputation_set\":1,\"reputation_level\":1},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-1-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=1070034\",\"domain\":\"\"},\"wholesale_price\":[{\"count_min\":2,\"count_max\":5,\"price\":\"Rp 135.000\"}],\"condition\":1,\"preorder\":0,\"department_id\":223,\"labels\":[{\"title\":\"WholeSale\",\"color\":\"#44a9ec\"}],\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=1070034\"}]},{\"id\":37308468,\"name\":\"Karet Rambut Korea Isi 300 Buah Glow In The Dark Kuning Kpop Aksesoris\",\"uri\":\"https://www.tokopedia.com/kpopaksesoris/karet-rambut-korea-isi-300-buah-glow-in-the-dark-kuning-kpop-aksesoris\",\"image_uri\":\"https://ecs7.tokopedia.net/img/cache/200-square/product-1/2016/5/4/37308468/37308468_a11f0bfa-976c-4db3-915b-fe938a452ef9.jpg\",\"price\":\"Rp 14.900\",\"shop\":{\"id\":982422,\"name\":\"Kpop Aksesoris\",\"uri\":\"https://www.tokopedia.com/kpopaksesoris\",\"is_gold\":0,\"rating\":{\"speed\":0,\"accuracy\":5,\"service\":0,\"reputation_score\":73,\"reputation_set\":1,\"reputation_level\":4},\"location\":\"Jakarta\",\"reputation_image_uri\":\"https://ecs7.tokopedia.net/img/repsys/bronze-4-hd.gif\",\"shop_lucky\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=982422\",\"domain\":\"\"},\"wholesale_price\":[{\"count_min\":10,\"count_max\":11,\"price\":\"Rp 9.900\"}],\"condition\":1,\"preorder\":0,\"department_id\":1233,\"labels\":[{\"title\":\"WholeSale\",\"color\":\"#44a9ec\"}],\"badges\":[{\"title\":\"Lucky Merchant\",\"image_url\":\"https://clover.tokopedia.com/badges/merchant/v1?shop_id=982422\"}]}],\"header\":{\"total_data\":22455271},\"category\":{\"selected_id\":\"\"},\"filter\":{\"user_id\":0}}";
        mockRestApiModule.mockWebServer.enqueue(new MockResponse().setBody(body));


        onView(withId(R.id.btn_test)).perform(click());
        Thread.sleep(3000);
        onView(withId(R.id.text)).check(matches(withText(containsString("ORGANIC LIP BALM"))));

    }
}
