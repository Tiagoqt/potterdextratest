package br.com.tagliaferrodev.dextra.pottertest.upload

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.multipart.MultipartFile

@RestController
@RequestMapping("uploads")
class UploadController {

    @PostMapping("image")
    fun uploadFile(@RequestParam("arquivo") file: MultipartFile,
                   @RequestParam("json") texto: String): ResponseEntity<String> {
        return ResponseEntity.ok("Recebido o arquivo ${file.originalFilename}\nJuntamente com o json: $texto")
    }
}