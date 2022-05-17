package weatherdemo;

import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Produces;
import io.micronaut.views.View;
import io.micronaut.views.turbo.TurboFrameView;

@Controller("/")
public class WeatherController {

    @Get
    @Produces(MediaType.TEXT_HTML)
    @View("/index")
    HttpResponse index() {
        return HttpResponse.ok();
    }

    @Get("/withWeather")
    @TurboFrameView("/_pageWithWeatherWidget")
    @Produces(value = {MediaType.TEXT_HTML})
    public HttpResponse<?> withWeather() {
        return HttpResponse.ok();
    }

    @Get("/withoutWeather")
    @Produces(value = {MediaType.TEXT_HTML})
    @TurboFrameView("/_pageWithoutWeatherWidget")
    public HttpResponse<?> withoutWeather() {
        return HttpResponse.ok();
    }
}
