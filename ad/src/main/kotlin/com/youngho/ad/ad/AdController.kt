package com.youngho.ad.ad

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RequiredArgsConstructor
@RestController
class AdController (private val adRepository: AdRepository){



    @GetMapping("/ad")
    fun getAd() : Mono<Ad>{
        val ad = Ad(
                title = "샘플",
                content = "광고~",
                tags = mutableListOf("태그1", "태그2")
        )

        return adRepository.save(ad);
    }

}