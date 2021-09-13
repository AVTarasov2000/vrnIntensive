package vrn.tarasovy.intensive.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import vrn.tarasovy.intensive.dto.PlaceDto;
import vrn.tarasovy.intensive.repository.PlaceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static vrn.tarasovy.intensive.utils.IntensiveMappers.PLACE_MAPPER;

@Service
public class PlaceService {
    @Autowired
    PlaceRepository placeRepository;

    public PlaceDto addPlace(PlaceDto placeDto){
        if (placeDto.getId() != null){
            throw new IllegalArgumentException();
        }
        return PLACE_MAPPER.toDto(placeRepository.save(PLACE_MAPPER.toDao(placeDto)));
    }

    public PlaceDto updatePlace(PlaceDto placeDto){
        if (placeDto.getId() == null){
            throw new IllegalArgumentException();
        }
        return PLACE_MAPPER.toDto(placeRepository.save(PLACE_MAPPER.toDao(placeDto)));
    }

    public void deletePlace(PlaceDto placeDto){
        placeRepository.delete(PLACE_MAPPER.toDao(placeDto));
    }

    public List<PlaceDto> getAllPlaces(){
        return placeRepository.findAll().stream()
                .map(dao -> PLACE_MAPPER.toDto(dao))
                .collect(Collectors.toList());
    }

    public List<PlaceDto> findFree(){
//        todo
        return new ArrayList <>();
    }


}
